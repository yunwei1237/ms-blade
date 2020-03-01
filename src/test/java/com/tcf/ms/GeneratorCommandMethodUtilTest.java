package com.tcf.ms;

import com.tcf.ms.util.GeneratorOperationMethodUtil;
import org.junit.Test;

/**
 *
 */
public class GeneratorCommandMethodUtilTest {
    GeneratorOperationMethodUtil util = new GeneratorOperationMethodUtil();

    @Test
    public void test(){
        util.printAllOperationInfo();
    }

    @Test
    public void test4(){
        util.printOperationClass();
    }

    @Test
    public void printNoArgsOperations(){
        util.printNoArgsOperations();
    }

    @Test
    public void getAllParamIdObj(){
        util.getAllParamIdObj();
    }

    @Test
    public void getAllCommandFirstWord(){
        util.getAllCommandFirstWord();
    }


    @Test
    public void exportJavaFileList(){
        util.exportJavaFileList("src\\main\\java\\com\\tcf\\ms\\test");
    }

    /**
     * 生成全部操作指令
     */
    @Test
    public void exportJavaFileList2(){
        util.exportJavaFileList("src\\main\\java\\com\\tcf\\ms\\command\\core\\operation");
    }

    @Test
    public void generatorHandle(){
        util.exportHandle("src\\main\\java\\com\\tcf\\ms\\command\\core\\object\\handle");
    }
}
