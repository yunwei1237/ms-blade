package com.tcf.ms.command.core.object;
//####################################################################################################################
//#  Each item record contains the following fields:
//#  1) Item id: used for referencing items in other files.
//#     The prefix itm_ is automatically added before each item id.
//#  2) Item name. Name of item as it'll appear in inventory window
//#  3) List of meshes.  Each mesh record is a tuple containing the following fields:
//#    3.1) Mesh name.
//#    3.2) Modifier bits that this mesh matches.
//#     Note that the first mesh record is the default.
//#  4) Item flags. See header_items.py for a list of available flags.
//#  5) Item capabilities. Used for which animations this item is used with. See header_items.py for a list of available flags.
//#  6) Item value.
//#  7) Item stats: Bitwise-or of various stats about the item such as:
//#      weight, abundance, difficulty, head_armor, body_armor,leg_armor, etc...
//#  8) Modifier bits: Modifiers that can be applied to this item.
//#  9) [Optional] Triggers: List of simple triggers to be associated with the item.
//####################################################################################################################

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.BladeException;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Accessors(chain = true)
public class Item implements Operation, CanVariable {
    /**
     * 物品id
     */
    private String itemId;
    /**
     * 物品名称
     */
    private String itemName;
    /**
     * 物品的模型集合
     *  会有多个可以指定，至少有一个
     *  箭的模型其实是两个，一个是弓箭，另一个是箭袋组成
     */
    private MesheItem[] meshes;
    /**
     * 物品标识
     */
    private ItemHeader.ItemFlag[] flags;
    /**
     * 物品能力
     */
    private ItemHeader.ItemCapability[] capabilities;
    /**
     * 物品价格
     */
    private int value;
    /**
     * 物品特性
     */
    private ItemStat[] itemStats;
    /**
     * 物品修饰符
     */
    private ItemHeader.ItemModifier modifier;
    /**
     * 简单触发器
     */
    private ScriptSpan scriptSpan;

    @Override
    public String toScriptString() {
        //["no_item","INVALID ITEM", [("practice_sword",0)], itp_type_one_handed_wpn|itp_primary|itp_secondary, itc_longsword, 3,weight(1.5)|spd_rtng(103)|weapon_length(90)|swing_damage(16,blunt)|thrust_damage(10,blunt),imodbits_none],
        if(scriptSpan == null){
            return String.format("[\"%s\",\"%s\", [%s], %s, %s, %s,%s,%s],",this.itemId,this.itemName,MesheItem.getValue(this.meshes),ItemHeader.ItemFlag.getValue(this.flags),ItemHeader.ItemCapability.getValue(this.capabilities),this.value,ItemStat.getValue(this.itemStats),this.modifier.getName());
        }
        return String.format("[\"%s\",\"%s\", [%s], %s, %s, %s,%s,%s,%s],",this.itemId,this.itemName,MesheItem.getValue(this.meshes),ItemHeader.ItemFlag.getValue(this.flags),ItemHeader.ItemCapability.getValue(this.capabilities),this.value,ItemStat.getValue(this.itemStats),this.modifier.getName(),String.format("[%s]",scriptSpan.toScriptString()));
    }

    @Override
    public StringVariable getVar() {
        return Variable.constant(String.format("itm_%s", this.itemId));
    }

    @Override
    public void setVar(StringVariable variable) {
        throw new BladeException("数据对象无法设置变量");
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class MesheItem{
        private String meshName;
        private ItemHeader.ItemMetheFlag flag;

        public static String getValue(MesheItem[] meshes){
            return meshes == null || meshes.length == 0 ? "" : Arrays.stream(meshes).map(mesheItem -> String.format("(\"%s\",%s)",mesheItem.meshName,mesheItem.flag.getName())).collect(Collectors.joining(","));
        }
    }
    @Data
    @AllArgsConstructor
    public static class ItemStat{
        private String name;
        private int value;

        @Override
        public String toString() {
            return String.format("%s(%s)",this.name,this.value);
        }

        public static String getValue(ItemStat[] itemStats){
            return itemStats == null || itemStats.length == 0
                    ? "0"
                    : Arrays.stream(itemStats).map(itemStat -> itemStat.toString()).collect(Collectors.joining("|"));
        }

        public enum DamageType{
            cut("cut",0,"砍"),
            pierce("pierce",1,"刺"),
            blunt("blunt",2,"钝"),
            ;
            private String name;
            private int value;
            private String desc;

            DamageType(String name, int value, String desc) {
                this.name = name;
                this.value = value;
                this.desc = desc;
            }
        }
    }

    public static class ItemStatHelper{
        private List<ItemStat> list = new ArrayList<>();

        public static ItemStatHelper get(){
            return new ItemStatHelper();
        }

        public ItemStatHelper weight(double value){
            list.add(new Weight(value));
            return this;
        }

        public ItemStatHelper headArmor(int value){
            list.add(new HeadArmor(value));
            return this;
        }

        public ItemStatHelper bodyArmor(int value){
            list.add(new BodyArmor(value));
            return this;
        }

        public ItemStatHelper legArmor(int value){
            list.add(new LegArmor(value));
            return this;
        }

        public ItemStatHelper difficulty(int value){
            list.add(new Difficulty(value));
            return this;
        }

        public ItemStatHelper hitPoints(int value){
            list.add(new HitPoints(value));
            return this;
        }

        public ItemStatHelper spdRtng(int value){
            list.add(new SpdRtng(value));
            return this;
        }

        public ItemStatHelper shootSpeed(int value){
            list.add(new ShootSpeed(value));
            return this;
        }

        public ItemStatHelper weaponLength(int value){
            list.add(new WeaponLength(value));
            return this;
        }

        public ItemStatHelper maxAmmo(int value){
            list.add(new MaxAmmo(value));
            return this;
        }

        public ItemStatHelper thrustDamage(int value, ItemStat.DamageType damageType){
            list.add(new ThrustDamage(value,damageType));
            return this;
        }

        public ItemStatHelper swingDamage(int value,ItemStat.DamageType damageType){
            list.add(new SwingDamage(value,damageType));
            return this;
        }

        public ItemStatHelper horseSpeed(int value){
            list.add(new HorseSpeed(value));
            return this;
        }

        public ItemStatHelper horseManeuver(int value){
            list.add(new HorseManeuver(value));
            return this;
        }

        public ItemStatHelper horseCharge(int value){
            list.add(new HorseCharge(value));
            return this;
        }

        public ItemStatHelper foodQuality(int value){
            list.add(new FoodQuality(value));
            return this;
        }

        public ItemStatHelper Abundance(int value){
            list.add(new Abundance(value));
            return this;
        }

        public ItemStatHelper accuracy(int value){
            list.add(new Accuracy(value));
            return this;
        }

        public ItemStat[] getValue(){
            return list.toArray(new ItemStat[0]);
        }
    }

    /**
     * 物品重量
     */
    public static class Weight extends ItemStat{
        private double value;
        public Weight(double value) {
            super("weight", 0);
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("%s(%s)",this.getName(),this.value);
        }
    }

    /**
     * 头部护甲
     */
    public static class HeadArmor extends ItemStat{
        public HeadArmor(int value) {
            super("head_armor", value);
        }
    }

    /**
     * 身体护甲
     */
    public static class BodyArmor extends ItemStat{
        public BodyArmor(int value) {
            super("body_armor", value);
        }
    }

    /**
     * 腿部护甲
     */
    public static class LegArmor extends ItemStat{
        public LegArmor(int value) {
            super("leg_armor", value);
        }
    }

    /**
     * 难度，使用物品时需要的属性点或技能点
     *  马匹：骑术
     *  弓箭：强弓
     *  投掷：强掷
     *  单手，双手，长杆，弩箭：力量
     */
    public static class Difficulty extends ItemStat{
        public Difficulty(int value) {
            super("difficulty", value);
        }
    }

    /**
     * 盾生命值
     */
    public static class HitPoints extends ItemStat{
        public HitPoints(int value) {
            super("hit_points", value);
        }
    }

    /**
     * 挥砍速度（刺击和砍杀）
     */
    public static class SpdRtng extends ItemStat{
        public SpdRtng(int value) {
            super("spd_rtng", value);
        }
    }

    /**
     * 远程武器射击速度
     */
    public static class ShootSpeed extends ItemStat{
        public ShootSpeed(int value) {
            super("shoot_speed", value);
        }
    }

    /**
     * 武器长度，数值大时，可以伤害到远处的敌人
     */
    public static class WeaponLength extends ItemStat{
        public WeaponLength(int value) {
            super("weapon_length", value);
        }
    }

    /**
     * 食物：数量
     * 子弹类：数量
     */
    public static class MaxAmmo extends ItemStat{
        public MaxAmmo(int value) {
            super("max_ammo", value);
        }
    }

    /**
     * 刺伤值
     */
    public static class ThrustDamage extends ItemStat{

        private DamageType damageType;

        public ThrustDamage(int value,DamageType damageType) {
            super("thrust_damage", value);
            this.damageType = damageType;
        }

        @Override
        public String toString() {
            return String.format("%s(%s,%s)",this.getName(),this.getValue(),this.damageType.name);
        }
    }

    /**
     * 刺伤值
     */
    public static class SwingDamage extends ItemStat{

        private DamageType damageType;

        public SwingDamage(int value,DamageType damageType) {
            super("swing_damage", value);
            this.damageType = damageType;
        }

        @Override
        public String toString() {
            return String.format("%s(%s,%s)",this.getName(),this.getValue(),this.damageType.name);
        }
    }

    /**
     * 马匹速度，数值越大，速度越快
     */
    public static class HorseSpeed extends ItemStat{
        public HorseSpeed(int value) {
            super("horse_speed", value);
        }
    }

    /**
     * 马匹灵活性
     */
    public static class HorseManeuver extends ItemStat{
        public HorseManeuver(int value) {
            super("horse_maneuver", value);
        }
    }

    /**
     * 马匹冲刺，数值越高，代表在马匹在高速撞击时带来的伤害就越大
     */
    public static class HorseCharge extends ItemStat{
        public HorseCharge(int value) {
            super("horse_charge", value);
        }
    }

    /**
     * 食物的质量
     * 高质量的食物：50以上（牛肉）
     * 低质量的食物：50以下（腐烂的牛肉）
     */
    public static class FoodQuality extends ItemStat{
        public FoodQuality(int value) {
            super("food_quality", value);
        }
    }

    /**
     * 商店中出现频率
     * 取值范围： 0-100
     */
    public static class Abundance extends ItemStat{
        public Abundance(int value) {
            super("abundance", value);
        }
    }

    /**
     * 远程武器 精准度
     * 取值范围： 0-100
     */
    public static class Accuracy extends ItemStat{
        public Accuracy(int value) {
            super("accuracy", value);
        }
    }

}
