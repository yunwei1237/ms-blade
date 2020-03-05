package com.tcf.ms;

import cn.hutool.core.io.FileUtil;
import com.tcf.ms.util.GeneratorScriptUtil;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class GeneratorScriptUtilTest {


    GeneratorScriptUtil util = new GeneratorScriptUtil();

    @Test
    public void test(){
        List<GeneratorScriptUtil.ScriptInfo> list = util.parse();

        System.out.println("数量：" + list.size());
        list.forEach(System.out::println);
    }

    @Test
    public void printUnhandleScript(){
        util.printUnhandleScript();
    }
}
