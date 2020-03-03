package com.tcf.ms.util;

import cn.hutool.core.collection.CollectionUtil;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    /**
     * 取出两个集合中的交集
     * @param list1
     * @param list2
     * @param isContains  相等的条件 ：true代表是包含就可以，false代表相等
     * @param <T>
     * @return
     */
    public static <T> List<T> intersection(List<T> list1, List<T> list2,boolean isContains){
        List<T> result = new ArrayList<>();
        if(list1 == null || list2 == null || list1.size() == 0 || list2.size() == 0){
            return result;
        }
        list1.forEach(element->{
            if(isContains){
                if(list2.contains(element)){
                    result.add(element);
                }
            }else{
                if(list2.equals(element)){
                    result.add(element);
                }
            }
        });
        return result;
    }

    /**
     * 取出两个集合中的交集(包含)
     * @param list1
     * @param list2
     * @param <T>
     * @return
     */
    public static <T> List<T> intersectionContains(List<T> list1, List<T> list2){
        return ListUtil.intersection(list1,list2,true);
    }
    /**
     * 取出两个集合中的交集(相等)
     * @param list1
     * @param list2
     * @param <T>
     * @return
     */
    public static <T> List<T> intersectionEquals(List<T> list1, List<T> list2){
        return ListUtil.intersection(list1,list2,false);
    }

    public static boolean equalsAny(String text,List<String> items){
        if(StringUtils.isBlank(text) || CollectionUtil.isEmpty(items)){
            return false;
        }
        for (String item : items) {
            if(text.equals(item)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsAny(String text,List<String> items){
        if(StringUtils.isEmpty(text) || CollectionUtil.isEmpty(items)){
            return false;
        }
        for (String item : items) {
            if(text.contains(item)){
                return true;
            }
        }
        return false;
    }
}
