package com.tcf.ms.util;

import cn.hutool.core.io.FileUtil;
import com.tcf.ms.command.core.command.Script;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 读取和解析 operations.py文件
 * 此生成器，只针对 1.010版本，也就是原版脚本
 */
@Slf4j
public class GeneratorScriptUtil {

    private String scriptPath = "ModuleSystem/module_scripts.py";

    public GeneratorScriptUtil() {
    }

    public GeneratorScriptUtil(String scriptPath) {
        this.scriptPath = scriptPath;
    }

    public List<ScriptInfo> parse(){
        String text = FileUtil.readString(this.scriptPath, "UTF-8");
        return parseScriptNote(parseScript(text),text);
    }


    private List<ScriptInfo> parseScript(String text){
        List<ScriptInfo> result = new ArrayList<>();

        Pattern scriptPattern = Pattern.compile("\\(\\s*\"(\\w+)\"\\s*,\\s*\\[\\s*([^\\[\\]]*)\\s*\\]\\s*\\)\\s*");
        Matcher matcher = scriptPattern.matcher(text);
        while (matcher.find()){
            ScriptInfo info = new ScriptInfo();
            String name = matcher.group(1);
            String[] items = matcher.group(2).split(",");
            info.setScriptName(name).setOperations(Arrays.stream(items).map(item->item).collect(Collectors.toList()));
            result.add(info);
            log.debug("解析脚本：" + info.getScriptName());
        }
        return result;
    }

//    private List<ScriptInfo> parseScriptNote(List<ScriptInfo> list,String text){
//        list.forEach((info -> {
//            Pattern scriptPattern = Pattern.compile(String.format("((\\s*#\\s*[\\w :()=,-.;$']+)+\\s*)\\n\\(\"%s\",",info.scriptName));
//            Matcher matcher = scriptPattern.matcher(text);
//            if(matcher.find()){
//                log.debug("解析脚本注释："+info.getScriptName());
//                info.setScriptNote(matcher.group(1));
//            }else {
//                log.warn("该脚本没有找到注释：" + info.getScriptName());
//            }
//        }));
//        return list;
//    }

    private List<ScriptInfo> parseScriptNote(List<ScriptInfo> list,String text){
        String[] items = text.split("\\s*\\]\\s*\\)\\s*,");
        list.forEach((info -> {
            log.info("查找注释：{}",info.getScriptName());
            for (String item : items) {

                Pattern scriptPattern = Pattern.compile(String.format("((\\s*#\\s*[\\w :()=,-.;$'\"]+)+\\s*)\\n*\\(\"%s\",",info.scriptName));
                Matcher matcher = scriptPattern.matcher(item);
                if("update_party_creation_random_limits".equals(info.getScriptName()) && item.contains(info.getScriptName()) && !item.contains(String.format("\"script_%s",info.getScriptName()))){
                    System.out.println("debug");
                }

                if(item.contains(info.getScriptName()) && !item.contains(String.format("\"script_%s",info.getScriptName())) && matcher.find()){
                    log.info("找到脚本注释");
                    info.setScriptNote(matcher.group(1));
                    break;
                }
            }
            if(Objects.isNull(info.getScriptNote())){
                log.warn("该脚本没有找到注释：" + info.getScriptName());
            }
        }));
        return list;
    }

    /**
     * 解析全部脚本的id，用于和生成的脚本作对比，以便知道哪些脚本没有解析到
     * @return
     */
    private List<String> parseScriptIds(){
        List<String> scriptIds = FileUtil.readLines("ModuleSystem/ID_scripts.py", "UTF-8");
        return scriptIds.stream().filter(scriptid -> !StringUtils.isEmpty(scriptid)).map(info -> info.split("=")[0].trim()).collect(Collectors.toList());
    }

    /**
     * 打印未处理的脚本信息
     */
    public void printUnhandleScript(){
        List<String> scriptIds = this.parseScriptIds();
        System.out.println("脚本id的数量："+scriptIds.size());
        List<GeneratorScriptUtil.ScriptInfo> list = this.parse();
        System.out.println("查找到的数量："+list.size());
        System.out.println("未处理脚本：");
        List<String> scripts = list.stream().map(info -> String.format("script_%s",info.getScriptName())).collect(Collectors.toList());
        scriptIds.stream().filter(info -> !scripts.contains(info)).forEach(System.out::println);
    }


    @Data
    @Accessors(chain = true)
    @ToString
    public static class ScriptInfo{
        private String scriptName;
        private String scriptNote;
        private List<String> operations;
    }
}
