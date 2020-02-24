package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.BladeException;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.operation.FactionGetSlot;
import com.tcf.ms.command.core.operation.FactionSetSlot;
import com.tcf.ms.command.core.operation.FactionSlotEq;
import lombok.Data;
import lombok.experimental.Accessors;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 所有slot操作的父类，主要功能是记录所有使用过的slotName,记录slotName所对应的值类型，以便取出进行操作时能够快速返回想要对象
 * 隔离用户手动操作module_constants.py文件内容，自动生成该文件内容，自动排序和对变量进行编号
 */
public abstract class AbstractSlotOperation implements SlotOperation {

    /**
     * 主脚本对象
     */
    protected ScriptSpan scriptSpan;

    public AbstractSlotOperation(ScriptSpan scriptSpan) {
        this.scriptSpan = scriptSpan;
    }

    /**
     * 记录所有的slotName和slot所对应的数据类型
     */
    private Map<String, Slot> slots = new HashMap<>();

    protected Slot getSlot(String slotName){
        return this.slots.get(slotName);
    }

    protected void setSlot(String slotName,CanVariable value){
        Slot slot = this.checkAndGetSlot(slotName).setSlotObj(value);
        this.slots.put(slotName,slot);
    }

    protected StringVariable getObjVar(String slotName){
        return Variable.local(String.format("slot_val_%s",slotName));
    }

    /**
     * slot最大个数的限制
     */
    private final int maxSize = 256;

    /**
     * 创建一个slot,在使用slot之前需要先进行创建，然后才能进行使用，以便系统能够进行管理
     * @param slotName
     * @param clazz
     */
    public void createSlot(String slotName,Class clazz){
        if(slots.containsKey(slotName)){
            throw new RuntimeException("名字为"+slotName+"的slot已经被使用");
        }
        if(slots.size() > maxSize){
            throw new RuntimeException("超过slot最大长度限制");
        }
        slots.put(slotName,new Slot().setSlotName(slotName).setSlotType(clazz));
    }

    protected Slot checkAndGetSlot(String slotName){
        Slot slot = getSlot(slotName);
        if(slot == null){
            throw new BladeException(String.format("名字为%s的slot还没有被创建，请先创建该slot", slotName));
        }
        return slot;
    }

    protected <T> T getAny(String slotName, CanVariable obj, Operation operation, Class< ? extends CanVariable> clazz) {
        Slot slot = this.checkAndGetSlot(slotName);
        this.scriptSpan.out(operation);
        CanVariable canVariable;
        try {
            canVariable = clazz.newInstance();
            canVariable.setVar(getObjVar(slotName));
            return (T)slot.getSlotObj();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void set(String slotName, CanVariable value,Operation operation) {
        this.setSlot(slotName,value);
        scriptSpan.out(operation);
    }

    /**
     * slot对象，用于保存相关信息
     * 如：
     *  slot名称
     *  slot数据类型
     */
    @Data
    @Accessors(chain = true)
    public static class Slot {
        /**
         * slot名称，需要在某个领域（faction,party_template,party,item,troop,agent,scene,quest）全局唯一
         * 名称一定要取得有意义，以便在取出时，可以快速生成想要对象类型
         */
        private String slotName;
        /**
         * slot的类型
         */
        private Class slotType;

        /**
         * slot代理对象，用于保存slot的值
         */
        private CanVariable slotObj;
    }
}


