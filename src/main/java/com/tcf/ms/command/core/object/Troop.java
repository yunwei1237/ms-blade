package com.tcf.ms.command.core.object;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.BladeException;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * ####################################################################################################################
 * #  Each troop contains the following fields:
 * #  1) Troop id (string): used for referencing troops in other files. The prefix trp_ is automatically added before each troop-id .
 * #  2) Toop name (string).
 * #  3) Plural troop name (string).
 * #  4) Troop flags (int). See header_troops.py for a list of available flags
 * #  5) Scene (int) (only applicable to heroes) For example: scn_reyvadin_castle|entry(1) puts troop in reyvadin castle's first entry point
 * #  6) Reserved (int). Put constant "reserved" or 0.
 * #  7) Faction (int)
 * #  8) Inventory (list): Must be a list of items
 * #  9) Attributes (int): Example usage:
 * #           str_6|agi_6|int_4|cha_5|level(5)
 * # 10) Weapon proficiencies (int): Example usage:
 * #           wp_one_handed(55)|wp_two_handed(90)|wp_polearm(36)|wp_archery(80)|wp_crossbow(24)|wp_throwing(45)
 * #     The function wp(x) will create random weapon proficiencies close to value x.
 * #     To make an expert archer with other weapon proficiencies close to 60 you can use something like:
 * #           wp_archery(160) | wp(60)
 * # 11) Skills (int): See header_skills.py to see a list of skills. Example:
 * #           knows_ironflesh_3|knows_power_strike_2|knows_athletics_2|knows_riding_2
 * # 12) Face code (int): You can obtain the face code by pressing ctrl+E in face generator screen
 * # 13) Face code (int)(2) (only applicable to regular troops, can be omitted for heroes):
 * #     The game will create random faces between Face code 1 and face code 2 for generated troops
 * #  town_1   Sargoth
 * #  town_2   Tihr
 * #  town_3   Veluca
 * #  town_4   Suno
 * #  town_5   Jelkala
 * #  town_6   Praven
 * #  town_7   Uxkhal
 * #  town_8   Reyvadin
 * #  town_9   Khudan
 * #  town_10  Tulga
 * #  town_11  Curaw
 * #  town_12  Wercheg
 * #  town_13  Rivacheg
 * #  town_14  Halmar
 * ####################################################################################################################
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Troop implements Operation, CanVariable {
    /**
     * 兵种id
     */
    private String troopId;
    /**
     * 兵种名称
     */
    private String troopName;
    /**
     * 兵种复数名称
     */
    private String pluralTroopName;
    /**
     * 兵种标识
     */
    private TroopHeader.TroopFlag[] flags;
    /**
     * 英雄出生地
     */
    private int Scene;
    /**
     * 默认值为常量reserved
     */
    private int reserved;
    /**
     * 阵营
     */
    private Faction faction;
    /**
     * 物品区
     */
    private int[] inventory;
    /**
     * 属性
     */
    private Attribute attribute;
    /**
     * 武器熟练度
     */
    private Proficiency proficiency;
    /**
     * 技能
     */
    private Skill skill;
    /**
     * 如果是普通兵种，使用faceCode1和faceCode2生成随机的面庞
     *
     * 如果是英雄，就作为英雄的面庞
     */
    private String faceCode1;
    /**
     * 如果是普通兵种，与faceCode1配合生成随机面庞
     *
     * 如果是英雄，就忽略
     */
    private String faceCode2;

    public Troop(String troopId, String troopName, String pluralTroopName, TroopHeader.TroopFlag[] flags, Faction faction, int[] inventory, Attribute attribute, Proficiency proficiency, Skill skill, String faceCode1, String faceCode2) {
        this.troopId = troopId;
        this.troopName = troopName;
        this.pluralTroopName = pluralTroopName;
        this.flags = flags;
        this.faction = faction;
        this.inventory = inventory;
        this.attribute = attribute;
        this.proficiency = proficiency;
        this.skill = skill;
        this.faceCode1 = faceCode1;
        this.faceCode2 = faceCode2;
    }

    @Override
    public String toScriptString() {
        return String.format("[\"%s\",\"%s\",\"%s\",%s,%s,%s,%s,[%s],%s,%s,%s,%s, %s],"
                ,this.troopId,this.troopName,this.pluralTroopName,TroopHeader.TroopFlag.getValue(this.flags),
                this.attribute.getValue(),this.proficiency.getValue(),this.Scene,this.reserved,this.faction.getVar(),
                this.inventory,this.skill.getValue(),this.faceCode1,this.faceCode2);
    }

    @Override
    public StringVariable getVar() {
        return Variable.constant(String.format("trp_%s",this.troopId));
    }

    @Override
    public void setVar(StringVariable variable) {
        throw new BladeException("数据对象无法设置变量");
    }

    /**
     * 基础属性
     */
    @Data
    @AllArgsConstructor
    public static class Attribute {
        /**
         * 力量
         */
        private int strength;
        /**
         * 敏捷
         */
        private int agility;
        /**
         * 智力
         */
        private int intelligence;
        /**
         * 魅力
         */
        private int charisma;
        /**
         * 等级
         */
        private int level;

        public String getValue(){
            return String.format("str_%s|agi_%s|int_%s|cha_%s|level(%s)",Math.max(3,strength),Math.max(3,agility),Math.max(3,intelligence),Math.max(3,charisma),Math.max(1,level));
        }

        public static Attribute def_attrib(){
            return new Attribute(7,5,4,4,0);
        }

        public static Attribute lord_attrib(){
            return new Attribute(20,20,20,20,38);
        }


        public static Attribute knight_attrib_1(){
            return new Attribute(15,14,8,16,22);
        }

        public static Attribute knight_attrib_2(){
            return new Attribute(16,16,10,18,26);
        }
        public static Attribute knight_attrib_3(){
            return new Attribute(18,17,12,20,30);
        }
        public static Attribute knight_attrib_4(){
            return new Attribute(19,19,13,22,35);
        }
        public static Attribute knight_attrib_5(){
            return new Attribute(20,20,15,25,41);
        }
    }

    /**
     * 熟练度
     */
    @Data
    public static class Proficiency{
        /**
         * 单手武器
         */
        private int oneHandedWeapon;
        /**
         * 双手武器
         */
        private int twoHandedWeapon;
        /**
         * 长杆武器
         */
        private int polearm;
        /**
         * 弓箭
         */
        private int archery;
        /**
         * 弩
         */
        private int crossbow;
        /**
         * 投掷
         */
        private int throwing;
        /**
         * 火器
         */
        private int firearm;

        public Proficiency(int oneHandedWeapon, int twoHandedWeapon, int polearm, int archery, int crossbow, int throwing, int firearm) {
            this.oneHandedWeapon = oneHandedWeapon;
            this.twoHandedWeapon = twoHandedWeapon;
            this.polearm = polearm;
            this.archery = archery;
            this.crossbow = crossbow;
            this.throwing = throwing;
            this.firearm = firearm;
        }

        public String getValue(){
            return String.format("wp_one_handed(%s)|wp_two_handed(%s)|wp_polearm(%s)|wp_archery(%s)|wp_crossbow(%s)|wp_throwing(%s)",this.oneHandedWeapon,this.twoHandedWeapon,this.polearm,this.archery,this.crossbow,this.firearm);
        }
    }

    public static class Wp extends Proficiency{
        /**
         * 通用熟练度
         */
        private int proficiency;

        public Wp(int proficiency) {
            super(proficiency, proficiency, proficiency, proficiency, proficiency, proficiency, proficiency);
            this.proficiency = proficiency;
        }

        public String getValue(){
            return String.format("wp(%s)",this.proficiency);
        }
    }

    public static class WpMelee extends Proficiency{
        /**
         * 通用熟练度
         */
        private int proficiency;

        public WpMelee(int proficiency) {
            super(proficiency, proficiency, proficiency, proficiency, proficiency, proficiency, proficiency);
            this.proficiency = proficiency;
        }

        public String getValue(){
            return String.format("wp_melee(%s)",this.proficiency);
        }
    }

    /**
     * 技能
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Accessors(chain = true)
    public static class Skill{
        /**
         * 交易
         */
        private int trade;
        /**
         * 统御
         */
        private int leadership;
        /**
         * 俘虏管理
         */
        private int prisonerManagement;
        /**
         * 工程学
         */
        private int engineer;
        /**
         * 急救
         */
        private int firstAid;
        /**
         * 手术
         */
        private int surgery;
        /**
         * 疗伤
         */
        private int woundTreatment;
        /**
         * 物品管理
         */
        private int inventoryManagement;
        /**
         * 侦察
         */
        private int spotting;
        /**
         * 向导
         */
        private int pathfinding;
        /**
         * 战术
         */
        private int tactics;
        /**
         * 跟踪
         */
        private int tracking;
        /**
         * 教练
         */
        private int trainer;
        /**
         * 骑射
         */
        private int horseArchery;
        /**
         * 骑术
         */
        private int riding;
        /**
         * 跑动
         */
        private int athletics;
        /**
         * 盾防
         */
        private int shield;
        /**
         * 武器掌握
         */
        private int weaponMaster;
        /**
         * 强弓
         */
        private int powerDraw;
        /**
         * 强掷
         */
        private int powerThrow;
        /**
         * 强击
         */
        private int powerStrike;
        /**
         * 铁骨
         */
        private int ironflesh;

        public String getValue(){
            List<String> list = new ArrayList<>();
            if(this.trade > 0){
                list.add(String.format("knows_trade_%s",this.trade));
            }
            if(this.leadership > 0){
                list.add(String.format("knows_leadership_%s",this.leadership));
            }
            if(this.prisonerManagement > 0){
                list.add(String.format("knows_prisoner_management_%s",this.prisonerManagement));
            }
            if(this.engineer > 0){
                list.add(String.format("knows_engineer_1%s",this.engineer));
            }
            if(this.firstAid > 0){
                list.add(String.format("knows_first_aid_%s",this.firstAid));
            }
            if(this.surgery > 0){
                list.add(String.format("knows_surgery_%s",this.surgery));
            }
            if(this.woundTreatment > 0){
                list.add(String.format("knows_wound_treatment_%s",this.woundTreatment));
            }
            if(this.inventoryManagement > 0){
                list.add(String.format("knows_inventory_management_%s",this.inventoryManagement));
            }
            if(this.spotting > 0){
                list.add(String.format("knows_spotting_%s",this.spotting));
            }
            if(this.pathfinding > 0){
                list.add(String.format("knows_pathfinding_%s",this.pathfinding));
            }
            if(this.tactics > 0){
                list.add(String.format("knows_tactics_%s",this.tactics));
            }
            if(this.tracking > 0){
                list.add(String.format("knows_tracking_%s",this.tracking));
            }
            if(this.trainer > 0){
                list.add(String.format("knows_trainer_%s",this.trainer));
            }
            if(this.horseArchery > 0){
                list.add(String.format("knows_horse_archery_%s",this.horseArchery));
            }
            if(this.riding > 0){
                list.add(String.format("knows_riding_%s",this.riding));
            }
            if(this.athletics > 0){
                list.add(String.format("knows_athletics_%s",this.athletics));
            }
            if(this.shield > 0){
                list.add(String.format("knows_shield_%s",this.shield));
            }
            if(this.weaponMaster > 0){
                list.add(String.format("knows_weapon_master_%s",this.weaponMaster));
            }
            if(this.powerDraw > 0){
                list.add(String.format("knows_power_draw_%s",this.powerDraw));
            }
            if(this.powerThrow > 0){
                list.add(String.format("knows_power_throw_%s",this.powerThrow));
            }
            if(this.powerStrike > 0){
                list.add(String.format("knows_power_strike_%s",this.powerStrike));
            }

            return String.join("|",list);
        }

        public static Skill knows_common(){
            return new Skill().setRiding(1).setTrade(2).setInventoryManagement(2).setPrisonerManagement(1).setLeadership(1);
        }

        public static Skill knight_skills_1(){
            return new Skill().setRiding(3).setIronflesh(2).setPowerDraw(3).setAthletics(1).setTactics(2).setPrisonerManagement(1).setLeadership(3);
        }
        public static Skill knight_skills_2(){
            return new Skill().setRiding(4).setIronflesh(3).setPowerDraw(4).setAthletics(2).setTactics(3).setPrisonerManagement(2).setLeadership(5);
        }
        public static Skill knight_skills_3(){
            return new Skill().setRiding(5).setIronflesh(4).setPowerDraw(5).setAthletics(3).setTactics(4).setPrisonerManagement(2).setLeadership(6);
        }
        public static Skill knight_skills_4(){
            return new Skill().setRiding(6).setIronflesh(5).setPowerDraw(6).setAthletics(4).setTactics(5).setPrisonerManagement(3).setLeadership(7);
        }
        public static Skill knight_skills_5(){
            return new Skill().setRiding(7).setIronflesh(6).setPowerDraw(7).setAthletics(5).setTactics(6).setPrisonerManagement(3).setLeadership(9);
        }
    }
}
