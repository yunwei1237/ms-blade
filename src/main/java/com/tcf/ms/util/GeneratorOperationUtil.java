package com.tcf.ms.util;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.io.FileUtil;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class GeneratorOperationUtil {

    private Logger logger = Logger.getLogger(GeneratorOperationUtil.class);


    @Data
    @Accessors(chain = true)
    @ToString
    public static class Command{
        private String commandNo;
        private String commandName;
        private boolean isDeprecated;
        private List<String> params = new ArrayList<>();
    }

    /**
     * 全部命令
     */
    private Map<String,Command> commands = new HashMap<>();

    /**
     * 全部条件命令
     */
    private List<String> conditionCommands = new ArrayList<>();
    /**
     *
     * 更新命令的编号
     * 如果命令集合中没有查找到的命令，就保存到命令集合中
     *
     */
    private void updateCommandNo(List<String> lines){
        Pattern pattern = Pattern.compile("^\\s*([a-zA-Z_]+\\w*)\\s*=\\s*(\\w+)");
        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                String commandName = matcher.group(1);
                String commandNo = matcher.group(2);
                Command newCommand = new Command().setCommandName(commandName).setCommandNo(commandNo);
                Command command = commands.putIfAbsent(commandName, newCommand);
                if(command != null){
                    command.setCommandNo(commandNo);
                    logger.info("命令已经查找到，成功更新编号，命令信息：" + command);
                }else{
                    logger.info("命令没有查找到，添加新的命令，命令信息：" + newCommand);
                }
            }
        }
    }

    /**
     * 收集全部命令，符合【(命令，<参数>,[参数]),】格式
     * @param text
     */
    private void collectCommands(String text){
        //匹配：(rest_for_hours_interactive,<rest_period>,[time_speed],[remain_attackable]),
        Pattern pattern = Pattern.compile("\\(\\s*([a-zA-Z_]+\\w*)(\\s*,\\s*[<\\[]\\s*([a-zA-Z_]+\\w*)\\s*[>\\]])*\\s*\\),");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            Command command = new Command();
            Pattern pattern2 = Pattern.compile("\\s*,\\s*[<\\[]\\s*([a-zA-Z_]+\\w*)[>\\]\\s*]\\s*");
            Matcher matcher2 = pattern2.matcher(matcher.group());
            command.setCommandName(matcher.group(1));
            while (matcher2.find()){
                command.getParams().add(matcher2.group(1));
            }
            commands.put(command.commandName,command);
        }
    }

    /**
     * 标记全部不推荐使用的命令
     * @param lines
     */
    private void updateDeprecated(List<String> lines){
        Map<String,String> texts = new HashMap();
        for (String line : lines) {
            if(StringUtils.isNotBlank(line) && !line.startsWith("#") && StringUtils.contains(line,"deprecated")){
                String key = line.trim().split("\\s+")[0];
                texts.putIfAbsent(key,line);
            }
        }

        for (String s : texts.keySet()) {
            commands.get(s).setDeprecated(true);
        }
    }

    /**
     * 收集
     * @param text
     */
    private void collectConditionCommands(String text){
        Pattern pattern = Pattern.compile("can_fail_operations\\s*=\\s*\\[(\\w+(,\\s*\\w+)*)\\s*\\]");
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            String value = matcher.group(1);
            String[] items = value.split(",");
            conditionCommands.addAll(CollectionUtil.newArrayList(Arrays.stream(items).map(String::trim).collect(Collectors.toList())));
        }
    }


    private String exportJavaFileList(Command command, String classPackage){

        if("neg".equals(command.getCommandName())){
            return String.format("package %s;\n" +
                    "\n" +
                    "import com.tcf.ms.command.Operation;\n" +
                    "import com.tcf.ms.command.core.Conditable;\n" +
                    "\n" +
                    "public class Neg implements Operation , Conditable {\n" +
                    "    private Operation operation;\n" +
                    "\n" +
                    "    public Neg(Operation operation) {\n" +
                    "        this.operation = operation;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public String toScriptString() {\n" +
                    "        if(operation instanceof Conditable) {\n" +
                    "            String str = operation.toScriptString();\n" +
                    "            //用于取反\n" +
                    "            if(str.startsWith(\"(neg|\")){\n" +
                    "                return str.replace(\"(neg|\", \"(\");\n" +
                    "            }\n" +
                    "            return str.replace(\"(\", \"(neg|\");\n" +
                    "        }\n" +
                    "        throw new RuntimeException(\"Neg Not Supporte \" + operation.getClass().getName());\n" +
                    "    }\n" +
                    "}\n",classPackage);
        }else if("this_or_next".equals(command.getCommandName())){
            return String.format("package %s;\n" +
                    "\n" +
                    "import com.tcf.ms.command.Operation;\n" +
                    "import com.tcf.ms.command.core.Conditable;\n" +
                    "\n" +
                    "public class ThisOrNext implements Operation , Conditable {\n" +
                    "    /**\n" +
                    "     * 操作\n" +
                    "     */\n" +
                    "    private Operation operation;\n" +
                    "\n" +
                    "    public ThisOrNext(Operation operation) {\n" +
                    "        this.operation = operation;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public String toScriptString() {\n" +
                    "        if(operation instanceof Conditable) {\n" +
                    "            String str = operation.toScriptString();\n" +
                    "            if(str.startsWith(\"(this_or_next|\")){\n" +
                    "                return str;\n" +
                    "            }\n" +
                    "            return str.replace(\"(\", \"(this_or_next|\");\n" +
                    "        }\n" +
                    "        throw new RuntimeException(\"ThisOrNext Not Supporte \" + operation.getClass().getName());\n" +
                    "    }\n" +
                    "}",classPackage);
        }


        String temp = "package %s;\n" +
                "\n" +
                "import com.tcf.ms.command.Operation;\n" +
                "import com.tcf.ms.command.core.base.var.Variable;\n" +
                "%s" +
                "\n" +
                "%s"+
                "public class %s implements Operation %s{\n" +
                "\n" +
                "    %s\n" +
                "\n" +
                "    public %s(%s) {\n" +
                "        %s "+
                "    \n    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String toScriptString() {\n" +
                "        return String.format(\"(%s),\"%s);\n" +
                "    }\n" +
                "}\n";

        List<String> params = changeParams(command.getParams());
        String commandName = command.getCommandName();
        String className = CaseUtil.largeCamelCase(commandName);
        String properties = CollectionUtil.isEmpty(params) ? "" : params.stream().map(param->String.format("private Variable %s;",param)).collect(Collectors.joining("\n    "));
        String params1 = CollectionUtil.isEmpty(params) ? "" : params.stream().map(param->String.format("Variable %s",param)).collect(Collectors.joining(","));
        String assign = CollectionUtil.isEmpty(params) ? "" : params.stream().map(param->String.format("this.%s = %s;",param,param)).collect(Collectors.joining("\n        "));
        String params2 = CollectionUtil.isEmpty(params) ? "" : "," + params.stream().collect(Collectors.joining(","));
        String format = CollectionUtil.isEmpty(params) ? commandName : commandName + "," + params.stream().map(param -> "%s").collect(Collectors.joining(","));;
        String deprecated = command.isDeprecated() ? "@Deprecated\n" : "";
        String condition = conditionCommands.contains(commandName) ? ",Conditable" : "";
        String conditionImport = conditionCommands.contains(commandName) ? "import com.tcf.ms.command.core.Conditable;\n" : "";

        return String.format(temp,classPackage,conditionImport,deprecated,className,condition,properties,className,params1,assign,format,params2);
    }

    private List<String> changeParams(List<String> params){
        //重复名称处理
        Map<String,Integer> cache = new HashMap<>();
        //全部生成小驼峰命名
        List<String> result = params.stream().map(param -> {
            String str = CaseUtil.smallCamelCase(param);
            if(cache.containsKey(str)) {
                cache.computeIfPresent(str, (key, val) -> val + 1);
            }else{
                cache.put(str, 1);
            }
            Integer index = cache.get(str);
            return String.format("%s%s",str,index == 1 ? "" : index);
        }).collect(Collectors.toList());


        return result;
    }

    private String generateJavaMethod(Command command){

        if("ne".equals(command.getCommandName())){
            return "public static String neg(String condition){\n" +
                    "        if(condition.startsWith(\"(neg|\")){\n" +
                    "            return condition.replace(\"(neg|\", \"(\");\n" +
                    "        }\n" +
                    "        return condition.replace(\"(\", \"(neg|\");\n" +
                    "    }";
        }else if("this_or_next".equals(command.getCommandName())){
            return "public static String thisOrNext(String condition){\n" +
                    "        if(condition.startsWith(\"(this_or_next|\")){\n" +
                    "            return condition;\n" +
                    "        }\n" +
                    "        return condition.replace(\"(\", \"(this_or_next|\");\n" +
                    "    }";
        }

        String temp = "%s"+
                "    public static String %s(%s){\n" +
                "        return String.format(\"(%s),\"%s);\n" +
                "    }\n\n";
        List<String> params = changeParams(command.getParams());
        String commandName = command.getCommandName();
        String methodName = CaseUtil.smallCamelCase(commandName);
        String params1 = CollectionUtil.isEmpty(params) ? "" : params.stream().map(param->String.format("Variable %s",param)).collect(Collectors.joining(","));
        String params2 = CollectionUtil.isEmpty(params) ? "" : "," + params.stream().collect(Collectors.joining(","));
        String format = CollectionUtil.isEmpty(params) ? commandName : commandName + "," + params.stream().map(param -> "%s").collect(Collectors.joining(","));;
        String deprecated = command.isDeprecated() ? "@Deprecated\n" : "";
        return String.format(temp,deprecated,methodName,params1,format,params2);
    }

    private String generateStaticJavaFile(String classPackage){

        String temp = "package %s;\n" +
                "\n" +
                "import com.tcf.ms.command.Operation;\n" +
                "import com.tcf.ms.command.core.base.var.Variable;\n" +
                "\n" +
                "public class Operations {\n" +
                "\n%s\n" +
                "}\n";

        StringBuffer sb = new StringBuffer();
        for (Command command : commands.values()) {
            sb.append(generateJavaMethod(command));
        }
        return String.format(temp,classPackage,sb.toString());
    }

    /**
     * 处理命令,生成命令信息
     * @param path
     */
    private void handleCommand(String path){
        String text = FileUtil.readString(new File(path), "UTF-8");
        List<String> lines = FileUtil.readLines(new File(path), "UTF-8");
        collectCommands(text);
        updateCommandNo(lines);
        updateDeprecated(lines);
        collectConditionCommands(text);
    }

    /**
     * 生成类包路径
     * @param targetDir
     * @return
     */
    private String getClassPackage(String targetDir){
        File file = new File(targetDir);
        if(!file.exists()){
            file.mkdir();
        }
        return targetDir.split("java")[1].substring(1).replace("/",".").replace("\\",".");
    }

    /**
     * 以静态方式形式生成静态方法类，
     * 每一条命令是一个静态方法
     */
    public void exportStaticJavaFile(String path, String targetDir){
        String classPackage = getClassPackage(targetDir);
        handleCommand(path);
        String text = generateStaticJavaFile(classPackage);

        FileUtil.writeString(text,targetDir + "/Operations.java","UTF-8");
        System.out.println("生成完成");
    }

    /**
     * 以类的形式生成类的集合，
     * 每一条命令是一个类
     */
    public void exportJavaFileList(String path, String targetDir){
        String classPackage = getClassPackage(targetDir);
        handleCommand(path);
        for (Command command : commands.values()) {
            String javaText = exportJavaFileList(command,classPackage);
            FileUtil.writeString(javaText,targetDir + "/"+CaseUtil.largeCamelCase(command.getCommandName())+".java","UTF-8");
        }
        System.out.println("生成完成");
    }
}
