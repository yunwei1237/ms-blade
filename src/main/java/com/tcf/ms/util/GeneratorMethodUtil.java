package com.tcf.ms.util;

import java.util.*;

public class GeneratorMethodUtil {

    /**
     * 快速生成重载方法
     * @param methodFormat 方法格式字符串
     * @param paramName 参数名
     * @param types 参数可能类型
     */
    public static void createInterfaceMethod1Params(String methodFormat,String paramName, List<String> types){
        for (String type : types) {
            System.out.println(String.format(methodFormat, type, paramName));
        }
    }

    public static void createInterfaceMethod2Params(String methodFormat,List<String> paramNames, List<String> types){
        for (String type : types) {
            for (String type2 : types) {
                System.out.println(String.format(methodFormat, type,paramNames.get(0),type2, paramNames.get(1)));
            }
        }
    }

    public static void createInterfaceMethod3Params(String methodFormat,List<String> paramNames, List<String> types){
        for (String type : types) {
            for (String type2 : types) {
                for (String type3 : types) {
                    System.out.println(String.format(methodFormat, type,paramNames.get(0),type2, paramNames.get(1),type3, paramNames.get(2)));
                }
            }
        }
    }

    public static void createInterfaceMethod4Params(String methodFormat,List<String> paramNames, List<String> types){
        for (String type : types) {
            for (String type2 : types) {
                for (String type3 : types) {
                    for (String type4 : types) {
                        System.out.println(String.format(methodFormat, type,paramNames.get(0),type2, paramNames.get(1),type3, paramNames.get(2),type4, paramNames.get(3)));
                    }

                }
            }
        }
    }

    public static void createInterfaceMethod5Params(String methodFormat,List<String> paramNames, List<String> types){
        for (String type : types) {
            for (String type2 : types) {
                for (String type3 : types) {
                    for (String type4 : types) {
                        for (String type5 : types) {
                            System.out.println(String.format(methodFormat, type,paramNames.get(0),type2, paramNames.get(1),type3, paramNames.get(2),type4, paramNames.get(3),type5, paramNames.get(4)));
                        }
                    }
                }
            }
        }
    }




    public static void main(String[] args) {
        List<String> types = Arrays.asList("String","int","Variable");
//        String[] two = {"eq","neq","gt","ge","lt","le"};
//        for (String s : two) {
//            String format = String.format("Conditable %s(%s);",s,"%s %s,%s %s");
//            GeneratorMethodUtil.createInterfaceMethod2Params(format,Arrays.asList("value1","value2"),types);
//        }
//
//        GeneratorMethodUtil.createInterfaceMethod3Params("Conditable between(%s %s,%s %s,%s %s);",Arrays.asList("destination","lowerBound","upperBound"),types);

        //void fori(Variable destion, Variable lower, Variable upper, Function<Variable, ActionOperation> function);
        //GeneratorMethodUtil.createInterfaceMethod3Params("void fori(%s %s, %s %s, %s %s, Function<Variable, ActionOperation> function);",Arrays.asList("destination","lower","upper"),types);
        GeneratorMethodUtil.createInterfaceMethod3Params("void foriReverse(%s %s, %s %s, %s %s, Function<Variable, ActionOperation> function);",Arrays.asList("destination","lower","upper"),types);

    }
}
