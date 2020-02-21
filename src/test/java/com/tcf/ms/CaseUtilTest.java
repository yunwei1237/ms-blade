package com.tcf.ms;

import com.tcf.ms.util.CaseUtil;
import org.junit.Test;

public class CaseUtilTest {

    @Test
    public void smallCamelCaseTest(){
        System.out.println(CaseUtil.smallCamelCase("try_for_range_backwards"));
        System.out.println(CaseUtil.smallCamelCase("try"));
    }

    @Test
    public void largeCamelCaseTest(){
        System.out.println(CaseUtil.largeCamelCase("try_for_range_backwards"));
        System.out.println(CaseUtil.largeCamelCase("try"));
    }
}
