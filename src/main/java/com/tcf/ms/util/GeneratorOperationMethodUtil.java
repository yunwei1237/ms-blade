package com.tcf.ms.util;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.io.FileUtil;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.io.File;
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

    private String operationFile = "ModuleSystem/header_operations.py";

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
                    }else if("agent_set_speed_limit".equals(operationName)){
                        List<Command.Param> paramList = new ArrayList<>();
                        paramList.add(new Command.Param().setParamName("agent_id"));
                        paramList.add(new Command.Param().setParamName("speed_limit"));
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
                                }else {
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

    /**
     * 获得命令集合，也就是operation.py的文件末尾配置信息
     * @param text
     * @return
     */
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

    /**
     * 将参数集合进行参数优化
     * @param params
     * @return
     */
    public List<String> changeParams(List<Command.Param> params){
        //创建参数优化处理器
        ParamHandle paramHandle = new ParamHandle();
        return params.stream().map(param -> paramHandle.handle(param.paramName)).collect(Collectors.toList());
    }

    /**
     * 将操作指令生成类文件
     * @param operation
     * @param classPackage
     * @param conditionCommands
     * @return
     */
    private String generateJavaFile(Command operation, String classPackage, List<String> conditionCommands){

        //特殊指令的处理
        if("neg".equals(operation.getOperationName())){
            return String.format("package %s;\n" +
                    "\n" +
                    "import com.tcf.ms.command.Operation;\n" +
                    "import com.tcf.ms.command.Conditable;\n" +
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
                    "import com.tcf.ms.command.Conditable;\n" +
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

        //普通操作指令的处理
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
        String conditionImport = conditionCommands.contains(commandName) ? "import com.tcf.ms.command.Conditable;\n" : "";

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

    /**
     * 操作类的配置
     */
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
                new Handle.HandleParam().setParamName("string_register").setReplaceParamType("SregVariable").setReplaceParamName("stringRegister"),
                new Handle.HandleParam().setParamName("position_no").setReplaceParamType("PosVariable").setReplaceParamName("position"),
                new Handle.HandleParam().setParamName("order_id")
        );
        //处理类的声明

        //队伍操作
        handles.add(new Handle("party","party_id")
                .setKeywords(Arrays.asList("party"))
                .setParamKeywords(Arrays.asList("party_id"))
                .setCanSlot(true)
                .setParams(handleParams)
                //排除
                .setExcludes(Arrays.asList(
                    "distribute_party_among_party_group"
                    ,"party_can_join"
                    ,"main_party_has_troop"
                    ,"agent_get_party_id"

                    ,"party_set_slot"
                    ,"party_get_slot"
                    ,"party_slot_eq"
                    ,"party_slot_ge"
                )));
        //兵种操作
        handles.add(new Handle("troop","troop_id")
                .setKeywords(Arrays.asList("troop"))
                .setParamKeywords(Arrays.asList("troop_id"))
                .setCanSlot(true)
                .setParams(handleParams)
                //排除
                .setExcludes(Arrays.asList(
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
                    ,"store_troop_count_prisoners"
                    ,"store_troop_count_companions"

                    ,"troop_set_slot"
                    ,"troop_get_slot"
                    ,"troop_slot_eq"
                    ,"troop_slot_ge"
                )));
        //代理操作
        handles.add(new Handle("agent","agent_id")
                .setKeywords(Arrays.asList("agent"))
                .setParamKeywords(Arrays.asList("agent_id"))
                .setCanSlot(true)
                .setParams(handleParams)
                //排除
                .setExcludes(Arrays.asList(
                    "get_player_agent_own_troop_kill_count"
                    ,"team_set_leader"
                    ,"get_player_agent_no"
                    ,"get_player_agent_kill_count"
                    ,"store_conversation_agent"
                    ,"try_for_agents"

                    ,"agent_set_slot"
                    ,"agent_get_slot"
                    ,"agent_slot_eq"
                    ,"agent_slot_ge"
            )));
        //物品操作
        handles.add(new Handle("item","item_id")
                .setKeywords(Arrays.asList("item"))
                .setParamKeywords(Arrays.asList("item_id"))
                .setCanSlot(true)
                .setParams(handleParams)
                //排除
                .setExcludes(Arrays.asList(
                    "item_set_slot"
                    ,"item_get_slot"
                    ,"item_slot_eq"
                    ,"item_slot_ge"

                    ,"agent_has_item_equipped"
                    ,"troop_add_items"
                    ,"player_has_item"
                    ,"troop_add_item"
                    ,"troop_remove_items"
                    ,"troop_has_item_equipped"
                    ,"troop_remove_item"
            )));
        //阵营操作
        handles.add(new Handle("faction","faction_id")
                .setKeywords(Arrays.asList("faction"))
                .setParamKeywords(Arrays.asList("faction_id"))
                .setCanSlot(true)
                .setParams(handleParams)
                //排除
                .setExcludes(Arrays.asList(
                        "party_set_faction"
                        ,"troop_set_faction"

                        ,"faction_set_slot"
                        ,"faction_get_slot"
                        ,"faction_slot_eq"
                        ,"faction_slot_ge"
                )));

        //队伍模板操作
        handles.add(new Handle("party_template","party_template_id")
                .setKeywords(Arrays.asList("party_template"))
                .setParamKeywords(Arrays.asList("party_template_id"))
                .setCanSlot(true)
                .setParams(handleParams)
                //排除
                .setExcludes(Arrays.asList(
                        "store_num_parties_destroyed_by_player"
                        ,"party_add_template"

                        ,"party_template_set_slot"
                        ,"party_template_get_slot"
                        ,"party_template_slot_eq"
                        ,"party_template_slot_ge"
                )));

        //任务模板操作
        handles.add(new Handle("quest","quest_id")
                .setKeywords(Arrays.asList("quest"))
                .setParamKeywords(Arrays.asList("quest_id"))
                .setCanSlot(true)
                .setParams(handleParams)
                //排除
                .setExcludes(Arrays.asList(
                        "quest_set_slot"
                        ,"quest_get_slot"
                        ,"quest_slot_eq"
                        ,"quest_slot_ge"
                )));
        //场景操作
        handles.add(new Handle("scene","scene_id")
                .setKeywords(Arrays.asList("scene"))
                .setParamKeywords(Arrays.asList("scene_id"))
                .setCanSlot(true)
                .setParams(handleParams)
                //排除
                .setExcludes(Arrays.asList(
                        "scene_set_slot"
                        ,"scene_get_slot"
                        ,"scene_slot_eq"
                        ,"scene_slot_ge"
                )));
//        //玩家操作
        handles.add(new Handle("player").setKeywords(Arrays.asList("player","main_party")).setParams(handleParams)
                //排除
                .setExcludes(Arrays.asList(

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

    /**
     * 生成各种对象的操作类，如，party,troop,item等等
     * @param info
     * @return
     */
    private String generatorHandle(HandleInfo info){
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
        importSets.add("import com.tcf.ms.command.Conditable;");
        importSets.add("import com.tcf.ms.command.core.base.var.Variable;");
        importSets.add("import com.tcf.ms.command.core.base.var.StringVariable;");
        List<String> methods = new ArrayList<>();

        List<HandleInfo.CommandInfo> staticCommandInfos = info.getStaticCommandInfos();
        List<HandleInfo.CommandInfo> commonCommandInfos = info.getCommonCommandInfos();
        //将两个命令集合合并
        staticCommandInfos.addAll(commonCommandInfos);
        staticCommandInfos.forEach((commandInfo -> {
            String methodFormat = "    /**\n" +
                    "     * %s\n" +
                    "     * @return\n" +
                    "     */\n" +
                    "%s"+
                    "    public%s %s %s(%s){\n" +
                    "        return new %s(%s);\n" +
                    "    }\n";
            Command command = commandInfo.command;
            String note = command.note;
            String returnType = commandInfo.returnTypeName;
            String methodName = CaseUtil.smallCamelCase(command.operationName);
            String isStatic = commandInfo.isStatic ? " static" : "";
            String isDeprecated = command.isDeprecated ? "    @Deprecated\n" : "";
            String methodObjName = CaseUtil.largeCamelCase(command.operationName);
            String formalParam = String.join(",",commandInfo.formalParams);
            String actualParam = String.join(",",commandInfo.actualParams);
            //去除已经删除的方法
            if(!command.isDeleted) {
                importSets.addAll(commandInfo.imports);
                methods.add(String.format(methodFormat, note, isDeprecated, isStatic, returnType, methodName, formalParam, methodObjName, actualParam));
            }
        }));

        String className = CaseUtil.largeCamelCase(info.className) + "Handle";

        //方法代码进行融合
        StringBuffer methodObjs = new StringBuffer();
        methods.forEach((method->{
            methodObjs.append(method + "\n");
        }));

        String slotFormat = "";
        if(info.canSlot){
            slotFormat = String.format("    public SlotOperation slot(){\n" +
                    "        return new %s(this.variable);\n" +
                    "    }\n\n",CaseUtil.largeCamelCase(info.className) + "Slot");
            importSets.add("import com.tcf.ms.command.core.object.handle.slot.SlotOperation;");
            importSets.add(String.format("import com.tcf.ms.command.core.object.handle.slot.%s;", CaseUtil.largeCamelCase(info.className) + "Slot"));
        }

        String importStr = importSets.stream().collect(Collectors.joining("\n"));
        return String.format(format,info.classPackage,importStr,className,className,slotFormat,methodObjs);
    }

    /**
     * 导出Handle相关的类
     * @param targetDir
     */
    public void exportHandle(String targetDir){
        log.info("开始导出handle类");
        Map<String, Command> operations = getOperations(FileUtil.readLines(this.operationFile, "UTF-8"));
        log.info("操作指令解析完毕");
        Map<String, List<String>> operationCollection = getOperationCollection(FileUtil.readString(this.operationFile, "UTF-8"));
        log.info("特殊操作指令集合解析完毕");
        File targetDirFile = new File(targetDir);
        if(!targetDirFile.exists()){
            targetDirFile.mkdir();
            log.info("创建文件夹：{}",targetDir);
        }
        List<Command> useCommands = new ArrayList<>();
        //处理handle的配置
        handles.forEach(handle -> {
            log.info("{}：处理配置类",handle.className);
            //创建类文件
            HandleInfo handleInfo = filterCommandInfo(operations, handle, operationCollection.get(CAN_FAIL_OPERATIONS), targetDir);
            log.info("{}：生成数据对象", handle.className);
            createHandleFile(handleInfo);
            //记录已经生成的操作
            useCommands.addAll(handleInfo.commands);
        });
        List<Command> unuseCommands = getUnuseCommands(operations.values().stream().collect(Collectors.toList()), useCommands);
        log.debug("没有使用的操作集合");
        log.debug("数量：" + unuseCommands.size());
        log.debug("=========================================================================");
        unuseCommands.stream().map(command -> String.format("%s\t\t\t#%s",StringUtils.rightPad(command.operationName,40),command.grammar)).forEach(System.out::println);
        log.debug("=========================================================================");

    }

    private List<Command> getUnuseCommands(List<Command> allCommands,List<Command> usedCommands){
        List<Command> unuseCommands = new ArrayList<>();
        List<String> usedCommandStrs = usedCommands.stream().map(comm -> comm.operationName).collect(Collectors.toList());
        allCommands.forEach(command -> {
            //如果已经使用的集合中不包含指令，说明该指令还没有使用
            if(!usedCommandStrs.contains(command.operationName)){
                unuseCommands.add(command);
            }
        });
        return unuseCommands;
    }


    /**
     * 创建类文件
     * @param info
     */
    private void createHandleFile(HandleInfo info){
        String javaPath = info.filePath;
        File javaFile = new File(javaPath);
        if(javaFile.exists()){
            javaFile.delete();
            log.info("删除已经存在的文件：{}",javaPath);
        }
        String javaText = generatorHandle(info);
        log.info("{}：创建文件：{}",info.className,javaPath);
        FileUtil.writeString(javaText,javaFile,"UTF-8");
        log.info("{}：数据写入完毕",info.className,javaPath);
    }

    /**
     * 过滤要处理的指令
     * @param operations
     * @param handle
     * @return
     */
    private HandleInfo filterCommandInfo(Map<String, Command> operations,Handle handle,List<String> conditionCommands,String targetDir){
        HandleInfo handleInfo = new HandleInfo();
        List<Command> commands = new ArrayList<>();
        operations.forEach((name,oper)->{
            //添加到集合中的三种条件：
            //1.includes代表一定要添加的
            //2.指令的名字中包含关键字的
            //3.参数的名字中包含关键字的
            if(
                    handle.includes.equals(name)
                    || ListUtil.containsAny(name,handle.keywords)
                    || ListUtil.intersectionContains(oper.params.stream().map(Command.Param::getParamName).collect(Collectors.toList()), handle.paramKeywords).size() > 0
            ){
                //需要排除的指令
                // 1.已经删除的
                // 2.已经排除的
                if(!handle.excludes.contains(name) && !oper.isDeleted) {
                    commands.add(oper);
                }
            }

        });

        handleInfo.setClassName(handle.className);
        handleInfo.setCanSlot(handle.canSlot);
        handleInfo.setCommands(commands);
        handleInfo.setFilePath(String.format("%s\\%sHandle.java",targetDir,CaseUtil.largeCamelCase(handle.className)));
        handleInfo.setClassPackage(getClassPackage(targetDir));

        List<HandleInfo.CommandInfo> commonCommands = new ArrayList<>();
        List<HandleInfo.CommandInfo> staticCommands = new ArrayList<>();
        Set<String> imports = new HashSet<>();
        //处理参数
        commands.forEach((command -> {
            HandleInfo.CommandInfo commandInfo = new HandleInfo.CommandInfo();

            List<String> formalParams = new ArrayList<>();
            List<String> actualParams = new ArrayList<>();

            commandInfo.setCommandClassName(CaseUtil.largeCamelCase(command.operationName));
            commandInfo.setMethodName(CaseUtil.smallCamelCase(command.operationName));
            commandInfo.setReturnTypeName(conditionCommands.equals(command.operationName) ? "Conditable" : "Operation");

            imports.add(String.format("import com.tcf.ms.command.core.operation.%s;",commandInfo.getCommandClassName()));
            imports.add(String.format("import com.tcf.ms.command.%s;",commandInfo.getReturnTypeName()));
            ParamHandle formalParamHandle = new ParamHandle();
            ParamHandle actualParamHandle = new ParamHandle();

            //保证this.variable只会使用一次
            AtomicBoolean unusedVar = new AtomicBoolean(false);
            command.params.forEach((param -> {
                AtomicBoolean isget = new AtomicBoolean(false);
                if(handle.params != null) {
                    handle.params.forEach(handleParam -> {
                        //如果处理参数中包含当前参数，也就是当前参数需要进行改变
                        if (handleParam.paramName.equals(param.paramName)) {
                            //如果当前参数不是即将生成类中已经有的变量，就正常生成参数信息
                            if(!ListUtil.equalsAny(param.paramName,handle.paramKeywords) || unusedVar.get()) {
                                formalParams.add(String.format("%s %s", handleParam.getType(), formalParamHandle.handle(handleParam.getParam(param.paramName))));
                                actualParams.add(String.format("%s.getVar()", actualParamHandle.handle(handleParam.getParam(param.paramName))));
                                if(handleParam.getType().endsWith("Variable")) {
                                    imports.add(String.format("import com.tcf.ms.command.core.base.var.%s;", handleParam.getType()));
                                }else{
                                    imports.add(String.format("import com.tcf.ms.command.core.object.%s;", handleParam.getType()));
                                }
                            }else{
                                //代表已经使用过了
                                unusedVar.set(true);
                                //如果是类中已经有的参数，直接使用就行了，不需要方法再传入
                                actualParams.add("this.variable");
                            }
                            isget.set(true);
                            return;
                        }
                    });
                }
                if(!isget.get()){
                    formalParams.add(String.format("Variable %s",formalParamHandle.handle(param.paramName)));
                    actualParams.add(String.format("%s",actualParamHandle.handle(param.paramName)));
                }
            }));
            commandInfo.setActualParams(actualParams);
            commandInfo.setFormalParams(formalParams);
            commandInfo.setImports(imports);
            commandInfo.setCommand(command);

            //如果指令参数中包含，指定的参数，如，party_id,agent_id,item_id等等是普通方法，如果不包含的话，就是静态方法
            if(command.params.stream().anyMatch((param -> param.paramName.equals(handle.paramName)))){
                commandInfo.setStatic(false);
                commonCommands.add(commandInfo);
            }else{
                commandInfo.setStatic(true);
                staticCommands.add(commandInfo);
            }


        }));
        handleInfo.setCommonCommandInfos(commonCommands);
        handleInfo.setStaticCommandInfos(staticCommands);
        return handleInfo;
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
         * handle的名称
         */
        private String className;
        /**
         * 代表命令关键字，匹配任何一个关键字都可以
         */
        private List<String> keywords;
        /**
         * 参数名称，代表当前对象的参数，如：Party的参数party_id,Agent的参数agent_id
         */
        private String paramName;
        /**
         * 代表参数关键字，匹配任何一个关键字都可以
         */
        private List<String> paramKeywords;
        /**
         * 参数的映射关系，以及处理功能
         */
        private List<HandleParam> params;

        /**
         * 是否可以进行slot操作
         */
        private boolean canSlot;

        /**
         * 排除的指令（用于微调）
         */
        private List<String> excludes = new ArrayList<>();

        /**
         * 包含的指令（用于微调）
         */
        private List<String> includes = new ArrayList<>();

        public Handle(String className, String paramName) {
            this.className = className;
            this.paramName = paramName;
        }

        public Handle(String className) {
            this(className,null);
        }
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

    @Data
    @Accessors(chain = true)
    @ToString
    public static class HandleInfo{
        /**
         * 生成对象的类名
         */
        private String className;
        /**
         * 类的包名
         */
        private String classPackage;
        /**
         * 生成的文件路径
         */
        private String filePath;
        /**
         * 是否可以进行slot操作
         */
        private boolean canSlot;
        /**
         * 要生成的指令集合
         */
        private List<Command> commands;
        /**
         * 要生成的指令信息(实例方法)
         */
        private List<CommandInfo> commonCommandInfos;
        /**
         * 要生成的指令信息(静态方法)
         */
        private List<CommandInfo> staticCommandInfos;

        @Data
        @Accessors(chain = true)
        @ToString
        public static class CommandInfo{
            /**
             * 指令类名
             */
            private String commandClassName;
            /**
             * 方法名称
             */
            private String methodName;
            /**
             * 返回值名称
             */
            private String returnTypeName;
            /**
             * 形式参数集合
             */
            private List<String> formalParams;
            /**
             * 实际参数集合
             */
            private List<String> actualParams;
            /**
             * 需要导入的类
             */
            private Set<String> imports;
            /**
             * 是否是静态方法
             */
            private boolean isStatic;
            /**
             * 命令本身
             */
            private Command command;
        }
    }


    public static class ParamHandle{
        //重复名称处理
        private Map<String,Integer> cache = new HashMap<>();

        /**
         * 对参数名称进行重复处理
         * @param paramName
         * @return
         */
        public String handle(String paramName){
            //全部生成小驼峰命名
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
    }
}
