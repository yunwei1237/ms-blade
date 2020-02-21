package com.tcf.ms;

import com.tcf.ms.util.GeneratorOperationUtil;
import org.junit.Test;

public class GeneratorUtilTest {

    GeneratorOperationUtil util = new GeneratorOperationUtil();

    @Test
    public void generateStaticMethodFile(){
        util.exportStaticJavaFile("D:\\游戏\\骑马与砍杀\\开发工具\\blade\\src\\main\\resources\\ModuleSystem\\header_operations.py","D:\\游戏\\骑马与砍杀\\开发工具\\blade\\src\\main\\java\\com\\tcf\\ms\\command\\core");
    }

    @Test
    public void generateJavaFile(){
        util.exportJavaFileList("D:\\游戏\\骑马与砍杀\\开发工具\\blade\\src\\main\\resources\\ModuleSystem\\header_operations.py","D:\\游戏\\骑马与砍杀\\开发工具\\blade\\src\\main\\java\\com\\tcf\\ms\\command\\core\\operation");
    }
}
