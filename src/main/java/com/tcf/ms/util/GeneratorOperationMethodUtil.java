package com.tcf.ms.util;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.io.FileUtil;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 此生成器，只针对 1.010版本，也就是原版脚本
 */
@Slf4j
public class GeneratorOperationMethodUtil {

    private String operationFile = "E:\\projects\\ms-blade\\src\\main\\resources\\ModuleSystem\\header_operations.py";

    public GeneratorOperationMethodUtil() {
    }

    public GeneratorOperationMethodUtil(String operationFile) {
        this.operationFile = operationFile;
    }

    //由于手误输错的全部单词
    private static Map<String,String> errorWords = new HashMap<>();
    static {
        errorWords.put("party_prisoner_stack_get_size","party_get_prisoner_stack_size");
        errorWords.put("party_set_flags","party_set_flag");
        errorWords.put("game_key_is_down","key_is_down");
        errorWords.put("agent_set_walk_forward_animation","agent_set_walk_forward_action");
        errorWords.put("party_remove_prisoners","party_remove_members");
        errorWords.put("str_store_string_reg","str_store_string");
        errorWords.put("store_and","store_or");
        errorWords.put("cur_item_set_tableau_material","cur_item_set_tableu_material");
        errorWords.put("context_menu_add_item","right_mouse_menu_add_item");
        errorWords.put("agent_set_stand_animation","agent_set_stand_action");
        errorWords.put("inflict_casualties_to_party_group","inflict_casualties_to_party");
        errorWords.put("store_num_regular_prisoners","store_mum_regular_prisoners");
        errorWords.put("dialog_box","tutorial_box");
        errorWords.put("mission_tpl_entry_set_override_flags","mission_entry_set_override_flags");
        errorWords.put("troop_raise_proficiency_linear","troop_raise_proficiency");
        errorWords.put("party_prisoner_stack_get_troop_id","party_get_prisoner_stack_troop");
        errorWords.put("mission_tpl_entry_add_override_item","mission_entry_add_override_item");
        errorWords.put("mission_time_speed_move_to_value","mission_speed_move_to_value");
        errorWords.put("mission_tpl_entry_clear_override_items","mission_entry_clear_override_items");
        errorWords.put("game_key_clicked","key_clicked");
    }

    /**
     * 操作指令集
     */
    private static String LHS_OPERATIONS = "lhs_operations";
    /**
     * 全局操作指令集
     */
    private static String GLOBAL_LHS_OPERATIONS = "global_lhs_operations";
    /**
     * 可以失败的操作指令集（条件操作）
     */
    private static String CAN_FAIL_OPERATIONS = "can_fail_operations";

    /**
     * 合并操作行的注释
     * @param lines
     * @return
     */
    public List<String> mergeLines(List<String> lines){
        List<String> result = new ArrayList<>();
        //操作
        Pattern operationPattern = Pattern.compile("^\\s*#?\\s*([a-zA-Z_]+\\w*)\\s*=\\s*(\\w+)\\s+");
        Pattern operationPattern2 = Pattern.compile("^\\s*#?\\s*([a-zA-Z_]+\\w*)\\s*=\\s*(\\w+)\\s*");
        //注释
        Pattern notePattern = Pattern.compile("^\\s*#.*");
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            Matcher matcher = operationPattern.matcher(line);
            Matcher matcher2 = operationPattern2.matcher(line);
            //如果当前文本是操作的开始部分
            if(matcher.find() || matcher2.find()){
                StringBuffer newLine = new StringBuffer(line);
                //查找是否有多行的注释
                // 1.首先不是被删除的操作指令 (store_current_site)
                // 2.符合注释的规范
                while (!operationPattern.matcher(lines.get(i+1)).find() && notePattern.matcher(lines.get(i+1)).find()){
                    //将注释保存到新的行
                    newLine.append(lines.get(++i).trim().replace("#"," "));
                }
                result.add(newLine.toString());
            }else{
                if(StringUtils.isNotBlank(line))
                    log.debug("不参与分析的原始数据："+line);
            }
        }
        return result;
    }

    /**
     * 收集全部指令
     * @param lines
     * @return
     */
    public Map<String, Command> getOperations(List<String> lines){
        Map<String, Command> result = new HashMap<>();
        //合并指令的注释内容
        List<String> newLines = mergeLines(lines);
        //分析全部行，查找指令的数据
        Pattern commandPattern = Pattern.compile("^\\s*#?\\s*([a-zA-Z_]+\\w*)\\s*=\\s*([\\w| ]+)\\s*(#.*)?$");

        for (int i = 0; i < newLines.size(); i++) {
            String line = newLines.get(i);
            Matcher matcher = commandPattern.matcher(line);
            //分析操作指令
            if(matcher.find()){
                Command operation = new Command();
                //如果是操作指令，获得相应内容
                operation.setText(line);
                operation.setOperationName(matcher.group(1));
                operation.setOperationNo(matcher.group(2));
                operation.setNote(matcher.group(3));
                //指令是否已经被删除
                if(Pattern.compile("^\\s*#+.+").matcher(line).find()){
                    operation.setDeleted(true);
                }
                //指令是否已经不推荐使用
                if(line.contains("deprecated")){
                    operation.setDeprecated(true);
                }

                //分析语法内容
                if(StringUtils.isNotBlank(operation.note)) {
                    //去掉注释内容的#号
                    operation.setNote(operation.note.replace("#"," "));
                    String operationName = operation.getOperationName();
                    //修复，由于工作人员手误而写错的语法内容
                    operationName = StringUtils.isNotBlank(errorWords.get(operationName)) ? errorWords.get(operationName) : operationName;
                    //处理特殊的语法格式
                    if("party_quick_attach_to_current_battle".equals(operationName)){
                        //由于在该指令中的语法的写法上有特殊符号，正则表达式不能解决，所以特殊对待
                        List<Command.Param> paramList = new ArrayList<>();
                        paramList.add(new Command.Param().setParamName("party_id").setOption(false));
                        paramList.add(new Command.Param().setParamName("side").setOption(false));
                        operation.setParams(paramList);
                    }else {
                        //生成语法匹配符
                        //Pattern grammerPattern = Pattern.compile(String.format("\\(\\s*%s(\\s*,\\s*.+\\s*)?\\),?",operationName));
                        Pattern grammerPattern = Pattern.compile(String.format("\\(\\s*%s(\\s*,\\s*[^()]+\\s*)?\\),?", operationName));
                        Matcher grammerMatcher = grammerPattern.matcher(operation.note);
                        if (grammerMatcher.find()) {
                            List<Command.Param> paramList = new ArrayList<>();
                            //如果有语法
                            operation.setGrammar(grammerMatcher.group());
                            String paramsGroup = grammerMatcher.group(1);
                            if (StringUtils.isNotBlank(paramsGroup)) {
                                //单独处理【change_screen_exchange_members】指令
                                if ("change_screen_exchange_members".equals(operation.getOperationName())) {
                                    paramList.add(new Command.Param().setParamName("exchange_leader").setOption(true));
                                } else {
                                    //去掉开头的逗号
                                    String params = paramsGroup.substring(1);
                                    String[] items = params.split(",");
                                    for (int j = 0; j < items.length; j++) {
                                        String item = items[j].trim();
                                        if (StringUtils.isNotBlank(item)) {
                                            Command.Param param = new Command.Param();
                                            //是必填项
                                            if (item.startsWith("<")) {
                                                param.setOption(false);
                                                //去掉两边的尖括号，然后保存参数名称
                                                param.setParamName(item.substring(1, item.length() - 1));
                                            } else if (item.startsWith("[")) {
                                                //可选时，有两路写法，
                                                //第一种：[param]
                                                //第二种：[<param>]
                                                if (item.startsWith("[<")) {
                                                    //去掉两边的中括号和尖括号，然后保存参数名称
                                                    param.setParamName(item.substring(2, item.length() - 2));
                                                } else {
                                                    //去掉两边的中括号，然后保存参数名称
                                                    param.setParamName(item.substring(1, item.length() - 1));
                                                }
                                            } else {
                                                param.setParamName(item);
                                            }
                                            paramList.add(param);
                                        }
                                    }
                                }
                                operation.setParams(paramList);
                            }
                        }
                    }
                }else{
                    log.debug("该操作没有注释：" + operation.getOperationName());
                    operation.setNote("");
                }
                result.put(operation.getOperationName(),operation);
            }else{
                log.debug("该命令行没有做任何操作："+line);
            }
        }
        return  result;
    }

    public Map<String,List<String>> getOperationCollection(String text){
        Map<String,List<String>> result = new HashMap<>();
        String[] types = {LHS_OPERATIONS,GLOBAL_LHS_OPERATIONS,CAN_FAIL_OPERATIONS};
        for (String type : types) {
            Pattern pattern = Pattern.compile(type + "\\s*=\\s*\\[(\\w+(,\\s*\\w+)*)\\s*\\]");
            List<String> operations = new ArrayList<>();
            Matcher matcher = pattern.matcher(text);
            if(matcher.find()){
                String value = matcher.group(1);
                String[] items = value.split(",");
                operations.addAll(CollectionUtil.newArrayList(Arrays.stream(items).map(String::trim).collect(Collectors.toList())));
            }
            result.put(type,operations);
        }
        //修复条件语句没有加入到条件操作集合
        result.get(CAN_FAIL_OPERATIONS).add("party_can_join_party");
        result.get(CAN_FAIL_OPERATIONS).add("item_slot_eq");
        result.get(CAN_FAIL_OPERATIONS).add("item_slot_ge");
        return result;
    }

    private String changeParam(Command.Param param){
        //重复名称处理
        Map<String,Integer> cache = new HashMap<>();
        //全部生成小驼峰命名
        String paramName = param.getParamName();
        //处理参数中包含特殊字符（-，/）
        if(paramName.contains("-")){
            paramName = paramName.substring(0,paramName.indexOf("-"));
        }else if(paramName.contains("/")){
            paramName = paramName.substring(0,paramName.indexOf("/"));
        }else if(paramName.contains(" ")){
            paramName = paramName.replace(" ","_");
        }
        String str = CaseUtil.smallCamelCase(paramName);
        if(cache.containsKey(str)) {
            cache.computeIfPresent(str, (key, val) -> val + 1);
        }else{
            cache.put(str, 1);
        }
        Integer index = cache.get(str);
        return String.format("%s%s",str,index == 1 ? "" : index);
    }

    private List<String> changeParams(List<Command.Param> params){
        return params.stream().map(param -> this.changeParam(param)).collect(Collectors.toList());
    }


    private String generateJavaFile(Command operation, String classPackage, List<String> conditionCommands){

        if("neg".equals(operation.getOperationName())){
            return String.format("package %s;\n" +
                    "\n" +
                    "import com.tcf.ms.command.Operation;\n" +
                    "import com.tcf.ms.command.core.Conditable;\n" +
                    "\n" +
                    "/**\n" +
                    " * %s\n" +
                    " */\n"+
                    "public class Neg implements Conditable {\n" +
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
                    "}\n",classPackage,operation.getNote());
        }else if("this_or_next".equals(operation.getOperationName())){
            return String.format("package %s;\n" +
                    "\n" +
                    "import com.tcf.ms.command.Operation;\n" +
                    "import com.tcf.ms.command.core.Conditable;\n" +
                    "\n" +
                    "/**\n" +
                    " * %s\n" +
                    " */\n"+
                    "public class ThisOrNext implements Conditable {\n" +
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
                    "}",classPackage,operation.getNote());
        }


        String temp = "package %s;\n" +
                "\n" +
                "import com.tcf.ms.command.Operation;\n" +
                "import com.tcf.ms.command.core.base.var.Variable;\n" +
                "%s" +
                "\n" +
                "/**\n" +
                " * %s\n" +
                " */\n"+
                "%s"+
                "public class %s implements %s{\n" +
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

        List<String> params = changeParams(operation.getParams());
        String commandName = operation.getOperationName();
        String className = CaseUtil.largeCamelCase(commandName);
        String properties = CollectionUtil.isEmpty(params) ? "" : params.stream().map(param->String.format("private Variable %s;",param)).collect(Collectors.joining("\n    "));
        String params1 = CollectionUtil.isEmpty(params) ? "" : params.stream().map(param->String.format("Variable %s",param)).collect(Collectors.joining(","));
        String assign = CollectionUtil.isEmpty(params) ? "" : params.stream().map(param->String.format("this.%s = %s;",param,param)).collect(Collectors.joining("\n        "));
        String params2 = CollectionUtil.isEmpty(params) ? "" : "," + params.stream().collect(Collectors.joining(","));
        String format = CollectionUtil.isEmpty(params) ? commandName : commandName + "," + params.stream().map(param -> "%s").collect(Collectors.joining(","));;
        String deprecated = operation.isDeprecated() ? "@Deprecated\n" : "";
        String condition = conditionCommands.contains(commandName) ? "Conditable" : "Operation";
        String conditionImport = conditionCommands.contains(commandName) ? "import com.tcf.ms.command.core.Conditable;\n" : "";

        return String.format(temp,classPackage,conditionImport,operation.getNote(),deprecated,className,condition,properties,className,params1,assign,format,params2);
    }

    /**
     * 打印全部指令的详情
     */
    public void printAllOperationInfo(){
        Map<String, Command> operations = getOperations(FileUtil.readLines(this.operationFile, "UTF-8"));
        Map<String, List<String>> operationCollection = getOperationCollection(FileUtil.readString(this.operationFile, "UTF-8"));
        System.out.println("关于操作指令的全部信息");
        System.out.println("当前操作的数量："+operations.size());
        operations.forEach((name,oper)-> {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("指令：" + name);
            System.out.println("状态："+(oper.isDeleted ? "已删除":"可使用"));
            System.out.println("推荐："+(oper.isDeprecated ? "否":"是"));
            System.out.println("指令参数集合：");
            oper.getParams().forEach(param -> System.out.println(String.format("\t参数名：%s(%s)",param.getParamName(),param.isOption()?"可选":"必选" )));
            System.out.println("语法：" + oper.grammar);
            System.out.println("简介：" + oper.note);
        });
        System.out.println("======================================================================");
        System.out.println("操作指令集合：");
        operationCollection.forEach((type,list)->{
            System.out.println("当前操作类型为：" + type);
            list.forEach(System.out::println);
        });
    }

    /**
     *  打印根据操作指令生成的类
     */
    public void printOperationClass(){
        Map<String, Command> operations = getOperations(FileUtil.readLines(this.operationFile, "UTF-8"));
        Map<String, List<String>> operationCollection = getOperationCollection(FileUtil.readString(this.operationFile, "UTF-8"));
        operations.forEach((name,operation)->{
            System.out.println(generateJavaFile(operation, "com.tcf.test", operationCollection.get(CAN_FAIL_OPERATIONS)));
        });
    }

    /**
     * 打印全部没有参数的操作指令
     */
    public void printNoArgsOperations(){
        Map<String, Command> operations = getOperations(FileUtil.readLines(this.operationFile, "UTF-8"));
        Map<String, List<String>> operationCollection = getOperationCollection(FileUtil.readString(this.operationFile, "UTF-8"));
        System.out.println("以下操作没有参数：");
        operations.forEach((name,operation)->{
            if(operation.getParams().size() == 0) {
                System.out.println("操作名称：" + operation.getOperationName());
                System.out.println("操作注释：" + operation.getNote());
            }
        });
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
     * 以类的形式生成类的集合，
     * 每一条命令是一个类
     * @param targetDir 类生成在哪个文件夹下
     */
    public void exportJavaFileList(String targetDir){
        String classPackage = getClassPackage(targetDir);
        Map<String, Command> operations = getOperations(FileUtil.readLines(this.operationFile, "UTF-8"));
        Map<String, List<String>> operationCollection = getOperationCollection(FileUtil.readString(this.operationFile, "UTF-8"));
        for (Command operation : operations.values()) {
            String javaText = generateJavaFile(operation,classPackage,operationCollection.get(CAN_FAIL_OPERATIONS));
            String javaPath = targetDir + "/"+CaseUtil.largeCamelCase(operation.getOperationName())+".java";
            File javaFile = new File(javaPath);
            if(javaFile.exists()){
                javaFile.delete();
                log.info("删除已经存在的文件：" + javaPath);
            }
            FileUtil.writeString(javaText,javaFile,"UTF-8");
        }
        System.out.println("生成完成");
        log.info("生成完成");
    }

    private static List<Handle> handles = new ArrayList<>();
    static {
        //参数处理
        List<Handle.HandleParam> handleParams = Arrays.asList(
                new Handle.HandleParam().setParamName("party_id"),
                new Handle.HandleParam().setParamName("scene_prop_id"),
                new Handle.HandleParam().setParamName("agent_id"),
                new Handle.HandleParam().setParamName("item_type_id"),
                new Handle.HandleParam().setParamName("string_id").setReplaceParamType("GameString"),
                new Handle.HandleParam().setParamName("mesh_id"),
                new Handle.HandleParam().setParamName("faction_id"),
                new Handle.HandleParam().setParamName("par_sys_id").setReplaceParamName("particleSystem").setReplaceParamType("ParticleSystem"),
                new Handle.HandleParam().setParamName("tableau_material_id"),
                new Handle.HandleParam().setParamName("presentation_id"),
                new Handle.HandleParam().setParamName("animation_id"),
                new Handle.HandleParam().setParamName("town_id").setReplaceParamType("Party"),
                new Handle.HandleParam().setParamName("sound_id"),
                new Handle.HandleParam().setParamName("quest_id"),
                new Handle.HandleParam().setParamName("itm_id").setReplaceParamType("Item"),
                new Handle.HandleParam().setParamName("particle_system_id").setReplaceParamName("particleSystem").setReplaceParamType("ParticleSystem"),
                new Handle.HandleParam().setParamName("menu_id"),
                new Handle.HandleParam().setParamName("mission_template_id"),
                new Handle.HandleParam().setParamName("map_icon_id"),
                new Handle.HandleParam().setParamName("troop_id"),
                new Handle.HandleParam().setParamName("item_id"),
                new Handle.HandleParam().setParamName("anim_id").setReplaceParamType("Animation"),
                new Handle.HandleParam().setParamName("key_id"),
                new Handle.HandleParam().setParamName("scene_id"),
                new Handle.HandleParam().setParamName("script_id"),
                new Handle.HandleParam().setParamName("object_id").setReplaceParamType("GameObject"),
                new Handle.HandleParam().setParamName("overlay_id"),
                new Handle.HandleParam().setParamName("item_kind_id"),
                new Handle.HandleParam().setParamName("track_id"),
                new Handle.HandleParam().setParamName("attribute_id"),
                new Handle.HandleParam().setParamName("game_key_id"),
                new Handle.HandleParam().setParamName("party_template_id"),
                new Handle.HandleParam().setParamName("skill_id"),
                new Handle.HandleParam().setParamName("order_id")
        );
        //处理类的声明

        //队伍操作
        handles.add(new Handle().setKeyword("party").setParamKeyword("party_id").setParams(handleParams).setExcludes(Arrays.asList(
                "distribute_party_among_party_group"
                ,"party_can_join"
        )));
        //兵种操作
        handles.add(new Handle().setKeyword("troop").setParamKeyword("troop_id").setParams(handleParams).setExcludes(Arrays.asList(
                "party_add_prisoners"
                ,"party_remove_members"
                ,"party_wound_members"
                ,"party_remove_members_wounded_first"
                ,"party_add_leader"
                ,"party_prisoner_stack_get_troop_dna"
                ,"party_stack_get_troop_id"
                ,"party_force_add_prisoners"
                ,"party_count_companions_of_type"
                ,"party_remove_prisoners"
                ,"party_stack_get_troop_dna"
                ,"party_force_add_members"
                ,"remove_member_from_party"
                ,"party_count_prisoners_of_type"
                ,"party_add_members"
                ,"party_prisoner_stack_get_troop_id"
                ,"party_count_members_of_type"
                ,"add_companion_party"
                ,"main_party_has_troop"
                ,"store_troop_count_prisoners"
                ,"store_troop_count_companions"
        )));
        //代理操作
        handles.add(new Handle().setKeyword("agent").setParamKeyword("agent_id").setParams(handleParams).setExcludes(Arrays.asList(
                "get_player_agent_own_troop_kill_count"
                ,"team_set_leader"
                ,"get_player_agent_no"
                ,"get_player_agent_kill_count"
                ,"store_conversation_agent"
                ,"try_for_agents"
        )));
    }

    /**
     * 获得所有参数以_id结束的
     */
    public void getAllParamIdObj() {
        Set<String> sets = new HashSet<>();
        Map<String, Command> operations = getOperations(FileUtil.readLines(this.operationFile, "UTF-8"));
        operations.forEach((name,operation)->{
            operation.params.forEach((param -> {
                if(param.getParamName().endsWith("_id")){
                    sets.add(param.getParamName());
                }
            }));
        });
        sets.forEach(System.out::println);
    }

    /**
     * 获得所有命令开头单词
     */
    public void getAllCommandFirstWord() {
        Set<String> sets = new HashSet<>();
        Map<String, Command> operations = getOperations(FileUtil.readLines(this.operationFile, "UTF-8"));
        operations.forEach((name,operation)->{
            int index = -1;
            if((index = name.indexOf("_")) != -1) {
                sets.add(name.substring(0, index));
            }else{
                sets.add(name);
            }
        });
        sets.forEach(System.out::println);
    }

    private static List<String> slotNams = Arrays.asList("agent","faction","item","party","party_template","quest","scene","troop");

    public String generatorHandle(Handle handle,List<Command> commands,List<String> conditionCommands,String classPackage){
        String format = "package %s;\n"+
                "\n"+
                "%s"+
                "\n\n"+
                "public class %s {\n" +
                "\n"+
                "    private StringVariable variable;\n" +
                "\n"+
                "    public %s(StringVariable variable) {\n" +
                "        this.variable = variable;\n" +
                "    }\n\n"+
                "%s"+
                "%s\n"+
                "}";
        Set<String> importSets = new HashSet<>();
        importSets.add("import com.tcf.ms.command.Operation;");
        importSets.add("import com.tcf.ms.command.core.Conditable;");
        importSets.add("import com.tcf.ms.command.core.base.var.Variable;");
        importSets.add("import com.tcf.ms.command.core.base.var.StringVariable;");
        List<String> methods = new ArrayList<>();
        commands.stream().forEach((command -> {
            String methodFormat = "    /**\n" +
                    "     * %s\n" +
                    "     * @return\n" +
                    "     */\n" +
                    "%s"+
                    "    public %s %s(%s){\n" +
                    "        return new %s(%s);\n" +
                    "    }\n";

            String note = command.note;
            String returnType = conditionCommands.contains(command.operationName)? "Conditable" : "Operation";
            String methodName = CaseUtil.smallCamelCase(command.operationName);
            StringBuffer formalParameter = new StringBuffer();
            StringBuffer actualParameter = new StringBuffer();
            command.params.forEach((param -> {
                AtomicBoolean isget = new AtomicBoolean(false);
                if(handle.params != null) {
                    handle.params.forEach(handleParam -> {
                        //如果处理参数中包含当前参数，也就是当前参数需要进行改变
                        if (handleParam.paramName.contains(param.paramName)) {
                            //如果当前参数不是即将生成类中已经有的变量，就正常生成参数信息
                            if(!param.paramName.contains(handle.paramKeyword)) {
                                formalParameter.append(String.format("%s %s,", handleParam.getType(), handleParam.getParam(param.paramName)));
                                actualParameter.append(String.format("%s.getVar(),", handleParam.getParam(param.paramName)));

                                importSets.add(String.format("import com.tcf.ms.command.core.object.%s;", handleParam.getType()));

                            }else{
                                //如果是类中已经有的参数，直接使用就行了，不需要方法再传入
                                actualParameter.append("this.variable,");
                            }
                            isget.set(true);
                            return;
                        }
                    });
                }
                if(!isget.get()){
                    formalParameter.append(String.format("Variable %s,",this.changeParam(param)));
                    actualParameter.append(String.format("%s,",this.changeParam(param)));
                }
            }));
            String isDeprecated = command.isDeprecated ? "    @Deprecated\n" : "";
            String methodObjName = CaseUtil.largeCamelCase(command.operationName);
            importSets.add(String.format("import com.tcf.ms.command.core.operation.%s;", methodObjName));
            String formalParam = formalParameter.toString();
            String actualParam = actualParameter.toString();
            //去除已经删除的方法
            if(!command.isDeleted)
                methods.add(String.format(methodFormat,note,isDeprecated,returnType,methodName,formalParam.contains(",") ? formalParam.substring(0,formalParam.length() - 1) : formalParam,methodObjName,actualParam.contains(",") ? actualParam.substring(0,actualParam.length() - 1) : actualParam));
        }));

        String className = CaseUtil.largeCamelCase(handle.getKeyword()) + "Handle";

        StringBuffer methodObjs = new StringBuffer();
        methods.forEach((method->{
            methodObjs.append(method + "\n");
        }));


        String slotFormat = "";
        if(slotNams.contains(handle.keyword)){
            slotFormat = String.format("    public SlotOperation slot(){\n" +
                    "        return new %sSlot(this.variable);\n" +
                    "    }\n\n",CaseUtil.largeCamelCase(handle.keyword));
            importSets.add("import com.tcf.ms.command.core.object.handle.slot.SlotOperation;");
            importSets.add(String.format("import com.tcf.ms.command.core.object.handle.slot.%sSlot;", CaseUtil.largeCamelCase(handle.keyword)));
        }

        String importStr = importSets.stream().collect(Collectors.joining("\n"));
        return String.format(format,classPackage,importStr,className,className,slotFormat,methodObjs);
    }

    /**
     * 导出Handle相关的类
     * @param targetDir
     */
    public void exportHandle(String targetDir){
        Map<String, Command> operations = getOperations(FileUtil.readLines(this.operationFile, "UTF-8"));
        Map<String, List<String>> operationCollection = getOperationCollection(FileUtil.readString(this.operationFile, "UTF-8"));

        File targetDirFile = new File(targetDir);
        if(!targetDirFile.exists()){
            try {
                targetDirFile.createNewFile();
            } catch (IOException e) {
                log.error("创建文件夹时出错：{}",targetDir);
            }
        }

        handles.forEach(handle -> {
            List<Command> commands = new ArrayList<>();
            operations.forEach((name,oper)->{

                //添加到集合中的三种条件：
                //1.includes代表一定要添加的
                //2.指令的名字中包含关键字的
                //3.参数的名字中包含关键字的
                if(handle.includes.contains(name)
                        || name.contains(handle.keyword)
                        || oper.params.stream().map(Command.Param::getParamName).anyMatch((paramName->paramName.contains(handle.paramKeyword)))
                ){
                    //检测是否有需要排除的指令，如果没有才进行添加
                    if(!handle.excludes.contains(name)) {
                        commands.add(oper);
                    }
                }
            });
            String javaPath = String.format("%s\\%sHandle.java",targetDir,CaseUtil.largeCamelCase(handle.keyword));
            File javaFile = new File(javaPath);
            if(javaFile.exists()){
                javaFile.delete();
                log.info("删除已经存在的文件：{}",javaPath);
            }
            String javaText = generatorHandle(handle,commands,operationCollection.get(CAN_FAIL_OPERATIONS),getClassPackage(targetDir));
            FileUtil.writeString(javaText,javaFile,"UTF-8");
            log.info("创建文件：{}",javaPath);
        });
    }


    /**
     * 操作对象
     */
    @Data
    @Accessors(chain = true)
    @ToString
    public static class Command {
        /**
         * 指令编号
         */
        private String operationNo;
        /**
         * 指令名称
         */
        private String operationName;
        /**
         * 指令是否不推荐使用
         */
        private boolean isDeprecated;

        /**
         * 指令是否删除
         */
        private boolean isDeleted;
        /**
         * 指令的注释
         */
        private String note;
        /**
         * 指令的参数集合
         */
        private List<Param> params = new ArrayList<>();

        /**
         * 原文本
         */
        private String text;

        /**
         * 语法
         */
        private String grammar;

        /**
         * 操作的参数信息
         */
        @Data
        @Accessors(chain = true)
        @ToString
        public static class Param{
            /**
             * 参数名称
             */
            private String paramName;
            /**
             * 是否为可选
             */
            private boolean isOption;
        }
    }

    /**
     * 处理类模板
     */
    @Data
    @Accessors(chain = true)
    @ToString
    public static class Handle{
        /**
         * 代表命令关键字
         */
        private String keyword;
        /**
         * 代表参数关键字
         */
        private String paramKeyword;
        /**
         * 进行参数修改
         */
        private List<HandleParam> params;

        /**
         * 排除的指令
         */
        private List<String> excludes = new ArrayList<>();

        /**
         * 包含的指令
         */
        private List<String> includes = new ArrayList<>();

        @Data
        @Accessors(chain = true)
        @ToString
        public static class HandleParam{
            /**
             * 【必选】
             * 要处理的参数名称
             * 以此参数名称结尾的变量
             * 如：host_party_id  符合 party_id 所以可以让paramName设置成party_id
             */
            private String paramName;
            /**
             * 使用的类型，
             * 如果不指定时，使用paramName变量,生成如下类型
             * 以party_id为例子
             * 1.去掉 _id host_party
             * 2.大驼峰命名 HostParty
             */
            private String replaceParamType;

            /**
             * 处理后的变量类型，如果不提供时
             * 如：host_party_id  符合 party_id 所以可以让paramName设置成party_id
             * 处理后的变量
             * 1.去掉 _id     ==>  host_party
             * 2.小驼峰命名   ==>  hostParty
             */
            private String replaceParamName;


            /**
             * 获得参数类型
             * @return
             */
            public String getType(){
                if(StringUtils.isNotBlank(replaceParamType)){
                    return replaceParamType;
                }
                return CaseUtil.largeCamelCase(this.paramName.replace("_id",""));
            }

            /**
             * 获得参数名称
             * @param paramName 没有经过任何处理的参数
             * @return
             */
            public String getParam(String paramName){
                if(StringUtils.isNotBlank(replaceParamName)){
                    return replaceParamName;
                }
                return CaseUtil.smallCamelCase(this.paramName.replace("_id",""));
            }
        }
    }
}
