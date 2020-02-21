package com.tcf.ms.command.core.object;

import com.tcf.ms.command.core.base.Function;
import com.tcf.ms.command.core.base.var.Variable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FactionHeader {

    //函数集合
    public static class Functions{
        public static Function max_player_rating(int rating){
            return new Function("max_player_rating", Variable.number(rating));
        }
    }

    public enum FactionFlag {
        ff_always_hide_label("ff_always_hide_label", "总是隐藏标签"),
        ;
        private String name;
        private String desc;

        FactionFlag(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public static FactionFlag[] list() {
            return values();
        }

        public static List<String> nameList() {
            List<String> nameList = new ArrayList<>();
            for (FactionFlag aiBhvr : list()) {
                nameList.add(aiBhvr.name);
            }
            return nameList;
        }

        public static FactionFlag get(String name) {
            for (FactionFlag aiBhvr : list()) {
                if (Objects.equals(aiBhvr.name, name)) {
                    return aiBhvr;
                }
            }
            return null;
        }

        public static String getValue(FactionFlag[] factionFlags) {
            if(factionFlags == null || factionFlags.length == 0){
                return "0";
            }
            return String.join("|", Arrays.stream(factionFlags).map(aiBhvr -> aiBhvr.name).collect(Collectors.toList()));
        }
    }
}
