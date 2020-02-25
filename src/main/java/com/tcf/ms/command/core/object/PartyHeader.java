package com.tcf.ms.command.core.object;

import com.tcf.ms.command.core.base.var.Variable;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 队伍的变量定义
 */
public class PartyHeader {

    public static Variable no_menu = Variable.constant("no_menu");
    public static PartyFlag[] pf_town = new PartyFlag[]{PartyFlag.pf_is_static,PartyFlag.pf_always_visible,PartyFlag.pf_show_faction,PartyFlag.pf_label_large,};
    public static PartyFlag[] pf_castle = new PartyFlag[]{PartyFlag.pf_is_static,PartyFlag.pf_always_visible,PartyFlag.pf_show_faction,PartyFlag.pf_label_medium,};
    public static PartyFlag[] pf_village = new PartyFlag[]{PartyFlag.pf_is_static,PartyFlag.pf_always_visible,PartyFlag.pf_hide_defenders,PartyFlag.pf_label_small,};

    public enum PartyFlag{
        //        PF_ICON_MASK("pf_icon_mask",""),
        pf_disabled("pf_disabled","禁用，在地图上不显示"),
        pf_is_ship("pf_is_ship","船只"),
        pf_is_static("pf_is_static","不可移动"),
        pf_label_small("pf_label_small","小标签，村庄"),
        pf_label_medium("pf_label_medium","中标签，城堡"),
        pf_label_large("pf_label_large","大标签，城镇"),
        pf_always_visible("pf_always_visible","一直显示"),
        pf_default_behavior("pf_default_behavior","默认行为"),
        pf_auto_remove_in_town("pf_auto_remove_in_town","在城镇中自动删除"),
        pf_quest_party("pf_quest_party","任务队伍"),
        pf_no_label("pf_no_label","不显示标签，桥，遗迹"),
        pf_limit_members("pf_limit_members","有人员限制"),
        pf_hide_defenders("pf_hide_defenders","隐藏守军"),
        pf_show_faction("pf_show_faction","显示阵营"),
//        PF_CARRY_GOODS_BITS("pf_carry_goods_bits","携带商品数量"),
//        PF_CARRY_GOLD_BITS("pf_carry_gold_bits","携带金币数量"),
//        PF_CARRY_GOLD_MULTIPLIER("pf_carry_gold_multiplier","携带金币数量"),
//        PF_CARRY_GOODS_MASK("pf_show_faction",""),
//        PF_CARRY_GOLD_MASK("pf_show_faction",""),
        ;
        private String name;
        private String desc;

        PartyFlag(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public static PartyFlag[] list(){
            return values();
        }

        public static List<String> nameList(){
            List<String> nameList = new ArrayList<>();
            for (PartyFlag partyFlag : list()) {
                nameList.add(partyFlag.name);
            }
            return nameList;
        }

        public static PartyFlag get(String name){
            for (PartyFlag partyFlag : list()) {
                if(Objects.equals(partyFlag.name,name)){
                    return partyFlag;
                }
            }
            return null;
        }

        public static String getValue(PartyFlag[] partyFlags){
            if(partyFlags == null || partyFlags.length == 0){
                return "0";
            }
            return String.join("|", Arrays.stream(partyFlags).map(partyFlag -> partyFlag.name).collect(Collectors.toList()));
        }
    }

    public enum AiBhvr{
        ai_bhvr_hold("ai_bhvr_hold","等待目标中"),
        ai_bhvr_travel_to_party("ai_bhvr_travel_to_party","向部队行进"),
        ai_bhvr_patrol_location("ai_bhvr_patrol_location","巡逻位置"),
        ai_bhvr_patrol_party("ai_bhvr_patrol_party","巡逻队伍"),
        ai_bhvr_track_party("ai_bhvr_track_party","追踪队伍"),
        ai_bhvr_attack_party("ai_bhvr_attack_party","攻击队伍"),
        ai_bhvr_avoid_party("ai_bhvr_avoid_party","逃避队伍"),
        ai_bhvr_travel_to_point("ai_bhvr_travel_to_point","移动到位置"),
        ai_bhvr_negotiate_party("ai_bhvr_negotiate_party","越过队伍"),
        ai_bhvr_in_town("ai_bhvr_in_town","在城堡中"),
        ai_bhvr_travel_to_ship("ai_bhvr_travel_to_ship","跟随船只"),
        ai_bhvr_escort_party("ai_bhvr_escort_party","护送队伍"),
        ai_bhvr_driven_by_party("ai_bhvr_driven_by_party","被带领"),
        ;
        private String name;
        private String desc;

        AiBhvr(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }

        public static AiBhvr[] list(){
            return values();
        }

        public static List<String> nameList(){
            List<String> nameList = new ArrayList<>();
            for (AiBhvr aiBhvr : list()) {
                nameList.add(aiBhvr.name);
            }
            return nameList;
        }

        public static AiBhvr get(String name){
            for (AiBhvr aiBhvr : list()) {
                if(Objects.equals(aiBhvr.name,name)){
                    return aiBhvr;
                }
            }
            return null;
        }

        public static String getValue(AiBhvr[] aiBhvrs){
            if(aiBhvrs == null || aiBhvrs.length == 0){
                return "0";
            }
            return String.join("|", Arrays.stream(aiBhvrs).map(aiBhvr -> aiBhvr.name).collect(Collectors.toList()));
        }
    }

    public enum Personality{
        courage_4("courage_4","勇气4"),
        courage_5("courage_5","勇气5"),
        courage_6("courage_6","勇气6"),
        courage_7("courage_7","勇气7"),
        courage_8("courage_8","勇气8"),
        courage_9("courage_9","勇气9"),
        courage_10("courage_10","勇气10"),
        courage_11("courage_11","勇气11"),
        courage_12("courage_12","勇气12"),
        courage_13("courage_13","勇气13"),
        courage_14("courage_14","勇气14"),
        courage_15("courage_15","勇气15"),


        aggressiveness_0("aggressiveness_0","攻击性0"),
        aggressiveness_1("aggressiveness_1","攻击性1"),
        aggressiveness_2("aggressiveness_2","攻击性2"),
        aggressiveness_3("aggressiveness_3","攻击性3"),
        aggressiveness_4("aggressiveness_4","攻击性4"),
        aggressiveness_5("aggressiveness_5","攻击性5"),
        aggressiveness_6("aggressiveness_6","攻击性6"),
        aggressiveness_7("aggressiveness_7","攻击性7"),
        aggressiveness_8("aggressiveness_8","攻击性8"),
        aggressiveness_9("aggressiveness_9","攻击性9"),
        aggressiveness_10("aggressiveness_10","攻击性10"),
        aggressiveness_11("aggressiveness_11","攻击性11"),
        aggressiveness_12("aggressiveness_12","攻击性12"),
        aggressiveness_13("aggressiveness_13","攻击性13"),
        aggressiveness_14("aggressiveness_14","攻击性14"),
        aggressiveness_15("aggressiveness_15","攻击性15"),
        ;
        private String name;
        private String desc;

        Personality(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public static Personality[] list(){
            return values();
        }

        public static List<String> nameList(){
            List<String> nameList = new ArrayList<>();
            for (Personality personality : list()) {
                nameList.add(personality.name);
            }
            return nameList;
        }

        public static Personality get(String name){
            for (Personality personality : list()) {
                if(Objects.equals(personality.name,name)){
                    return personality;
                }
            }
            return null;
        }

        public static String getValue(Personality[] personalities){
            if(personalities == null || personalities.length == 0){
                return "0";
            }
            return String.join("|", Arrays.stream(personalities).map(personality -> personality.name).collect(Collectors.toList()));
        }
    }
}
