package com.tcf.ms.command.core.object;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ItemHeader {

    public enum ItemFlag {
        itp_type_horse("itp_type_horse","马匹"),
        itp_type_one_handed_wpn("itp_type_one_handed_wpn","单手武器"),
        itp_type_two_handed_wpn("itp_type_two_handed_wpn","双手武器"),
        itp_type_polearm("itp_type_polearm","长杆武器"),
        itp_type_arrows("itp_type_arrows","弓箭"),
        itp_type_bolts("itp_type_bolts","弩箭"),
        itp_type_shield("itp_type_shield","盾牌"),
        itp_type_bow("itp_type_bow","弓"),
        itp_type_crossbow("itp_type_crossbow","弩"),
        itp_type_thrown("itp_type_thrown","投掷"),
        itp_type_goods("itp_type_goods","商品"),
        itp_type_head_armor("itp_type_head_armor","头部护甲"),
        itp_type_body_armor("itp_type_body_armor","身体护甲"),
        itp_type_foot_armor("itp_type_foot_armor","腿部护甲"),
        itp_type_hand_armor("itp_type_hand_armor","手部护甲"),
        itp_type_pistol("itp_type_pistol","手枪"),
        itp_type_musket("itp_type_musket","步枪，火枪"),
        itp_type_bullets("itp_type_bullets","子弹"),
        itp_type_animal("itp_type_animal","动物"),
        itp_type_book("itp_type_book","书籍"),

        itp_attach_left_item("itp_attach_left_item","附加在左边物品上"),
        itp_attach_left_hand("itp_type_one_handed_wpn","附加在左手上，弓"),
        itp_attach_forearm("itp_type_one_handed_wpn","附加在前臂"),
        itp_attach_armature("itp_type_one_handed_wpn","附加在护甲上"),

        itp_unique("itp_unique","唯一物品"),
        itp_always_loot("itp_always_loot","总是出现在打劫物品栏"),

        itp_no_parry("itp_no_parry","不能格挡"),
        itp_spear("itp_spear","矛"),
        itp_merchandise("itp_merchandise","商品"),
        itp_wooden_attack("itp_wooden_attack","木质攻击"),
        itp_wooden_parry("itp_wooden_parry","木质格挡"),
        itp_food("itp_food","食物"),

        itp_cant_reload_on_horseback("itp_cant_reload_on_horseback","马背上不能装填子弹"),
        itp_two_handed("itp_two_handed","双手武器"),
        itp_primary("itp_primary","主要武器"),
        itp_secondary("itp_secondary","次要武器"),
        itp_covers_legs("itp_covers_legs","覆盖腿部，靴子"),
        itp_doesnt_cover_hair("itp_doesnt_cover_hair","覆盖头发，头盔"),
        itp_consumable("itp_consumable","消耗品"),
        itp_bonus_against_shield("itp_bonus_against_shield","对盾奖励"),
        itp_penalty_with_shield("itp_penalty_with_shield","对盾惩罚，破盾"),
        itp_cant_use_on_horseback("itp_cant_use_on_horseback","马背上不能使用"),
        itp_civilian("itp_civilian","平民物品"),
        itp_fit_to_head("itp_fit_to_head","适合头部"),
        itp_covers_head("itp_covers_head","覆盖头部"),
        ;
        private String name;
        private String desc;

        ItemFlag(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }

        public static ItemFlag[] list(){
            return values();
        }

        public static List<String> nameList(){
            List<String> nameList = new ArrayList<>();
            for (ItemFlag partyFlag : list()) {
                nameList.add(partyFlag.name);
            }
            return nameList;
        }

        public static ItemFlag get(String name){
            for (ItemFlag partyFlag : list()) {
                if(Objects.equals(partyFlag.name,name)){
                    return partyFlag;
                }
            }
            return null;
        }

        public static String getValue(ItemFlag[] partyFlags){
            if(partyFlags == null || partyFlags.length == 0){
                return "0";
            }
            return String.join("|", Arrays.stream(partyFlags).map(partyFlag -> partyFlag.name).collect(Collectors.toList()));
        }
    }

    public enum ItemMetheFlag {
        ixmesh_none("0","无"),
        ixmesh_inventory("ixmesh_inventory","有容量，未使用"),
        ixmesh_flying_ammo("ixmesh_flying_ammo","弹药，如：库吉特箭"),
        ixmesh_carry("ixmesh_carry","可以携带的，如：箭袋"),
        ;
        private String name;
        private String desc;

        ItemMetheFlag(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }

        public static ItemMetheFlag[] list(){
            return values();
        }

        public static List<String> nameList(){
            List<String> nameList = new ArrayList<>();
            for (ItemMetheFlag partyFlag : list()) {
                nameList.add(partyFlag.name);
            }
            return nameList;
        }

        public static ItemMetheFlag get(String name){
            for (ItemMetheFlag partyFlag : list()) {
                if(Objects.equals(partyFlag.name,name)){
                    return partyFlag;
                }
            }
            return null;
        }

        public static String getValue(ItemMetheFlag[] partyFlags){
            if(partyFlags == null || partyFlags.length == 0){
                return "0";
            }
            return String.join("|", Arrays.stream(partyFlags).map(partyFlag -> partyFlag.name).collect(Collectors.toList()));
        }
    }

    public enum ItemCapability {
        //单手武器
        itcf_thrust_onehanded("itcf_thrust_onehanded","单手刺"),
        itcf_overswing_onehanded("itcf_overswing_onehanded","单手劈"),
        itcf_slashright_onehanded("itcf_slashright_onehanded","单手右砍"),
        itcf_slashleft_onehanded("itcf_slashleft_onehanded","单手左砍"),

        //双手武器
        itcf_thrust_twohanded("itcf_thrust_twohanded","双手刺"),
        itcf_overswing_twohanded("itcf_overswing_twohanded","双手劈"),
        itcf_slashright_twohanded("itcf_slashright_onehanded","双手右砍"),
        itcf_slashleft_twohanded("itcf_slashleft_onehanded","双手左砍"),

        //长杆武器
        itcf_thrust_polearm("itcf_thrust_polearm","长杆刺"),
        itcf_overswing_polearm("itcf_overswing_polearm","长杆劈"),
        itcf_slashright_polearm("itcf_slashright_polearm","长杆右砍"),
        itcf_slashleft_polearm("itcf_slashleft_polearm","长杆左砍"),

        //远程武器
        itcf_shoot_bow("itcf_throw_stone","弓箭射击"),
        itcf_shoot_javelin("itcf_shoot_javelin","标枪射击"),
        itcf_shoot_crossbow("itcf_shoot_crossbow","弩箭射击"),

        itcf_throw_stone("itcf_throw_stone","石头投掷"),
        itcf_throw_knife("itcf_throw_knife","飞刀投掷"),
        itcf_throw_axe("itcf_throw_axe","飞斧投掷"),
        itcf_throw_javelin("itcf_throw_javelin","标枪投掷"),
        itcf_shoot_pistol("itcf_shoot_pistol","手枪射击"),
        itcf_shoot_musket("itcf_shoot_musket","火枪射击"),
        //itcf_shoot_mask("itcf_shoot_mask","射击的辅助变量"),

        //马背上单手武器
        itcf_horseback_thrust_onehanded("itcf_horseback_thrust_onehanded","单手刺"),
        itcf_horseback_overswing_right_onehanded("itcf_horseback_overswing_right_onehanded","单手右劈"),
        itcf_horseback_overswing_left_onehanded("itcf_horseback_overswing_left_onehanded","单手左砍"),
        itcf_horseback_slashright_onehanded("itcf_horseback_slashright_onehanded","单手左砍"),
        itcf_horseback_slashleft_onehanded("itcf_horseback_slashleft_onehanded","单手左砍"),
        itcf_thrust_onehanded_lance("itcf_thrust_onehanded_lance","单手冲刺"),
        itcf_thrust_onehanded_lance_horseback("itcf_horseback_slashleft_onehanded","马背单手冲刺"),

        //士兵身上可以悬挂物品
        //itcf_carry_mask("itcf_carry_mask","悬挂辅助变量"),
        itcf_carry_sword_left_hip("itcf_carry_sword_left_hip","左边挂剑"),
        itcf_carry_axe_left_hip("itcf_carry_axe_left_hip","左边挂斧"),
        itcf_carry_dagger_front_left("itcf_carry_dagger_front_left","左前方挂匕首"),
        itcf_carry_dagger_front_right("itcf_carry_dagger_front_right","右前方挂匕首"),
        itcf_carry_quiver_front_right("itcf_carry_quiver_front_right","右前方挂箭袋"),
        itcf_carry_quiver_back_right("itcf_carry_quiver_back_right","右后方挂箭袋"),
        itcf_carry_quiver_right_vertical("itcf_carry_quiver_right_vertical","右水平方向挂箭袋"),
        itcf_carry_quiver_back("itcf_carry_quiver_back","后方挂箭袋"),
        itcf_carry_revolver_right("itcf_carry_revolver_right","右边挂手枪"),
        itcf_carry_pistol_front_left("itcf_carry_pistol_front_left","左前方挂火枪"),
        itcf_carry_bowcase_left("itcf_carry_bowcase_left","左边挂弓袋"),
        itcf_carry_mace_left_hip("itcf_carry_mace_left_hip","左边挂狼牙棒"),

        itcf_carry_axe_back("itcf_carry_axe_back","背着斧子"),
        itcf_carry_sword_back("itcf_carry_sword_back","背着剑"),
        itcf_carry_kite_shield("itcf_carry_kite_shield","背着风筝盾"),
        itcf_carry_round_shield("itcf_carry_round_shield","背着圆盾"),
        itcf_carry_buckler_left("itcf_carry_buckler_left","左手带盾"),
        itcf_carry_crossbow_back("itcf_carry_crossbow_back","背着弩"),
        itcf_carry_bow_back("itcf_carry_bow_back","背着弓"),
        itcf_carry_spear("itcf_carry_spear","背着矛"),
        itcf_carry_board_shield("itcf_carry_board_shield","背着板盾"),

        itcf_carry_katana("itcf_carry_katana","带着太刀，长武士刀"),
        itcf_carry_wakizashi("itcf_carry_wakizashi","带着胁差，短武士刀"),

        itcf_show_holster_when_drawn("itcf_show_holster_when_drawn","绘制时显示枪套"),

        //装填
        itcf_reload_pistol("itcf_reload_pistol","手枪装弹"),
        itcf_reload_musket("itcf_reload_musket","火枪装弹"),
        //itcf_reload_mask("itcf_reload_mask","装弹辅助变量"),

        //单手格挡
        itcf_parry_forward_onehanded("itcf_parry_forward_onehanded","单手格挡前方"),
        itcf_parry_up_onehanded("itcf_parry_up_onehanded","单手格挡上方"),
        itcf_parry_right_onehanded("itcf_parry_right_onehanded","单手格挡右方"),
        itcf_parry_left_onehanded("itcf_parry_left_onehanded","单手格挡左方"),

        //双手格挡
        itcf_parry_forward_twohanded("itcf_parry_forward_twohanded","双手格挡前方"),
        itcf_parry_up_twohanded("itcf_parry_up_twohanded","双手格挡上方"),
        itcf_parry_right_twohanded("itcf_parry_right_twohanded","双手格挡右方"),
        itcf_parry_left_twohanded("itcf_parry_left_twohanded","双手格挡左方"),

        //长杆格挡
        itcf_parry_forward_polearm("itcf_parry_forward_polearm","长杆格挡前方"),
        itcf_parry_up_polearm("itcf_parry_up_polearm","长杆格挡上方"),
        itcf_parry_right_polearm("itcf_parry_right_polearm","长杆格挡右方"),
        itcf_parry_left_polearm("itcf_parry_left_polearm","长杆格挡左方"),

        //itcf_force_64_bits("itcf_force_64_bits","强制64格"),

        itc_cleaver("itc_cleaver","菜刀类"),
        itc_dagger("itc_dagger","匕首类"),
        itc_parry_onehanded("itc_parry_onehanded","可格挡的单手武器类"),
        itc_longsword("itc_longsword","长剑类"),
        itc_scimitar("itc_scimitar","弯刀类"),
        itc_parry_two_handed("itc_parry_two_handed","可格挡的双手武器类"),
        itc_cut_two_handed("itc_cut_two_handed","可砍的双手武器类"),
        itc_greatsword("itc_greatsword","巨剑类"),
        itc_nodachi("itc_nodachi","日本太刀类"),
        itc_bastardsword("itc_bastardsword","护手剑类"),
        itc_parry_polearm("itc_parry_polearm","可格挡的长杆武器类"),
        itc_poleaxe("itc_poleaxe","长柄武器类"),
        itc_staff("itc_staff","长柄斧类"),
        itc_spear("itc_spear","长矛类"),
        itc_cutting_spear("itc_cutting_spear","可劈的长矛类"),
        itc_pike("itc_pike","冲刺类"),
        itc_greatlance("itc_greatlance","冲刺类，与itc_pike作用相同"),
        ;
        private String name;
        private String desc;

        ItemCapability(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }

        public static ItemCapability[] list(){
            return values();
        }

        public static List<String> nameList(){
            List<String> nameList = new ArrayList<>();
            for (ItemCapability partyFlag : list()) {
                nameList.add(partyFlag.name);
            }
            return nameList;
        }

        public static ItemCapability get(String name){
            for (ItemCapability partyFlag : list()) {
                if(Objects.equals(partyFlag.name,name)){
                    return partyFlag;
                }
            }
            return null;
        }

        public static String getValue(ItemCapability[] partyFlags){
            if(partyFlags == null || partyFlags.length == 0){
                return "0";
            }
            return String.join("|", Arrays.stream(partyFlags).map(partyFlag -> partyFlag.name).collect(Collectors.toList()));
        }
    }

    /**
     * 物品修饰符
     */
    public enum ItemModifier {
        imodbits_none("imodbits_none","无"),
        imodbits_horse_basic("imodbits_horse_basic","基础马匹修饰符"),
        imodbits_cloth("imodbits_cloth","衣服修饰符"),
        imodbits_armor("imodbits_armor","护甲修饰符"),
        imodbits_plate("imodbits_plate","板型物品修饰符"),
        imodbits_polearm("imodbits_polearm","长杆武器修饰符"),
        imodbits_shield("imodbits_shield","盾牌修饰符"),
        imodbits_sword("imodbits_sword","剑修饰符"),
        imodbits_sword_high("imodbits_sword_high","大剑修饰符"),
        imodbits_axe("imodbits_axe","斧子修饰符"),
        imodbits_mace("imodbits_mace","棒子修饰符"),
        imodbits_pick("imodbits_pick","可以携带的，如：箭袋"),
        imodbits_bow("imodbits_bow","弓修饰符"),
        imodbits_crossbow("imodbits_crossbow","弩修饰符"),
        imodbits_missile("imodbits_missile","子弹类修饰符"),
        imodbits_thrown("imodbits_thrown","投掷类修饰符"),

        imodbits_horse_good("imodbits_horse_good","优质马匹修饰符"),
        imodbits_good("imodbits_good","优质物品修饰符"),
        imodbits_bad("imodbits_bad","劣质物品修饰符"),
        ;
        private String name;
        private String desc;

        ItemModifier(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }

        public static ItemModifier[] list(){
            return values();
        }

        public static List<String> nameList(){
            List<String> nameList = new ArrayList<>();
            for (ItemModifier partyFlag : list()) {
                nameList.add(partyFlag.name);
            }
            return nameList;
        }

        public static ItemModifier get(String name){
            for (ItemModifier partyFlag : list()) {
                if(Objects.equals(partyFlag.name,name)){
                    return partyFlag;
                }
            }
            return null;
        }

        public static String getValue(ItemModifier[] partyFlags){
            if(partyFlags == null || partyFlags.length == 0){
                return "0";
            }
            return String.join("|", Arrays.stream(partyFlags).map(partyFlag -> partyFlag.name).collect(Collectors.toList()));
        }
    }
}
