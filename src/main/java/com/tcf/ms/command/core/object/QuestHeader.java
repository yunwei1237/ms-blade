package com.tcf.ms.command.core.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class QuestHeader {
    public enum QuestFlag {
        qf_show_progression("qf_show_progression","显示任务进度"),
        qf_random_quest("qf_random_quest","随机任务"),
        ;
        private String name;
        private String desc;

        QuestFlag(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public static QuestFlag[] list(){
            return values();
        }

        public static List<String> nameList(){
            List<String> nameList = new ArrayList<>();
            for (QuestFlag partyFlag : list()) {
                nameList.add(partyFlag.name);
            }
            return nameList;
        }

        public static QuestFlag get(String name){
            for (QuestFlag partyFlag : list()) {
                if(Objects.equals(partyFlag.name,name)){
                    return partyFlag;
                }
            }
            return null;
        }

        public static String getValue(QuestFlag[] partyFlags){
            if(partyFlags == null || partyFlags.length == 0){
                return "0";
            }
            return String.join("|", Arrays.stream(partyFlags).map(partyFlag -> partyFlag.name).collect(Collectors.toList()));
        }
    }
}
