package com.tcf.ms;

import cn.hutool.core.io.FileUtil;
import com.tcf.ms.util.GeneratorOperationMethodUtil;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.io.File;

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
    public void getAllOperationInfo(){
        String text = util.getAllOperationInfoInMarkDown();
        File file = new File("E:/projects/ms-blade/操作手册.md");
        FileUtil.writeString(text,file,"UTF-8");
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
        util.exportHandle("src\\main\\java\\com\\tcf\\ms\\test");
    }

    @Test
    public void generatorHandle2(){
        //util.exportHandle("src\\main\\java\\com\\tcf\\ms\\command\\core\\object\\handle");
    }


    @Test
    public void getAllOperationInfo2(){
        String text = new GeneratorOperationMethodUtil("E:\\projects\\prosperous-empire\\src\\header_operations.py").getAllOperationInfoInMarkDown();
        File file = new File("E:\\projects\\prosperous-empire\\操作手册.md");
        FileUtil.writeString(text,file,"UTF-8");
    }


    @Test
    public void turnFile(){
        File dir = new File("E:\\projects\\prosperous-empire\\src");
        String[] list = dir.list();
        for (String s : list) {
            File file = new File(dir,s);
            System.out.println(file.toString());
            FileUtil.writeString(FileUtil.readString(file,"GBK"),file,"UTF-8");
        }
    }

}
