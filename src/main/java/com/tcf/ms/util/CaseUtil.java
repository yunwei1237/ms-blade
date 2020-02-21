package com.tcf.ms.util;

import org.apache.commons.lang.StringUtils;

public class CaseUtil {
    /**
     * 小驼峰命名法，
     * 将 try_for_range_backwards
     * 转换成 tryForRangeBackwards
     * @param str
     * @return
     */
    public static String smallCamelCase(String str){
        int index = -1;
        while ((index = str.indexOf("_")) != -1){
            String start = str.substring(0,index);
            String end = StringUtils.capitalize(str.substring(index+1));
            str = start + end;
        }
        return str;
    }
    /**
     * 大驼峰命名法，
     * 将 try_for_range_backwards
     * 转换成 TryForRangeBackwards
     * @param str
     * @return
     */
    public static String largeCamelCase(String str){
        return StringUtils.capitalize(CaseUtil.smallCamelCase(str));
    }
}
