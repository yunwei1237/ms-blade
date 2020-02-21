package com.tcf.ms.command.core.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TroopHeader {





    /**
     * 兵种特性
     */
    public enum TroopFlag {
        tf_male("tf_male", "男性"),
        tf_female("tf_female", "女性"),
        tf_undead("tf_undead", "不死人"),
        tf_hero("tf_hero", "英雄"),
        tf_inactive("tf_inactive", "禁用"),
        tf_unkillable("tf_unkillable", "不可被杀死"),
        tf_allways_fall_dead("tf_allways_fall_dead", "一直都是死的"),
        tf_no_capture_alive("tf_no_capture_alive", "不能被抓到"),
        tf_mounted("tf_mounted", "骑兵"),
        tf_randomize_face("tf_randomize_face", "随机面庞"),
        tf_guarantee_boots("tf_guarantee_boots", "保证装备鞋子"),
        tf_guarantee_armor("tf_guarantee_armor", "保证装备铠甲"),
        tf_guarantee_helmet("tf_guarantee_helmet", "保证装备头盔"),
        tf_guarantee_gloves("tf_guarantee_gloves", "保证装备手套"),
        tf_guarantee_horse("tf_guarantee_horse", "保证装备马匹"),
        tf_guarantee_shield("tf_guarantee_shield", "保证装备盾牌"),
        tf_guarantee_ranged("tf_guarantee_ranged", "保证装备远程武器"),
        tf_unmoveable_in_party_window("tf_unmoveable_in_party_window", "不能放到城堡"),
        ;
        private String name;
        private String desc;

        TroopFlag(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public static TroopFlag[] list() {
            return values();
        }

        public static List<String> nameList() {
            List<String> nameList = new ArrayList<>();
            for (TroopFlag aiBhvr : list()) {
                nameList.add(aiBhvr.name);
            }
            return nameList;
        }

        public static TroopFlag get(String name) {
            for (TroopFlag aiBhvr : list()) {
                if (Objects.equals(aiBhvr.name, name)) {
                    return aiBhvr;
                }
            }
            return null;
        }

        public static String getValue(TroopFlag[] aiBhvrs) {
            if(aiBhvrs == null || aiBhvrs.length == 0){
                return "0";
            }
            return String.join("|", Arrays.stream(aiBhvrs).map(aiBhvr -> aiBhvr.name).collect(Collectors.toList()));
        }
    }

}
