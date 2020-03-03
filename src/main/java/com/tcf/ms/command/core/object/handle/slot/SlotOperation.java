package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.OperationWithResult;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.Conditable;

/**
 * slot的抽象操作
 */
public interface SlotOperation {

    /**
     * 声明一个slot,主要用于让系统记录声明的slot，
     * 以便在操作错误时，系统可以及时提醒，如变量没有声明，使用了没有声明的变量，使用重名变量，放进入一个物品，却以兵种或其它类型使用等等错误问题
     *
     * 注：不会生成任何脚本语句，只是用于记录数据，以便在用户出错时，及时提醒
     * @param slotName
     * @param clazz
     */
    void createSlot(String slotName,Class clazz);
    /**
     * 获得slot的值
     * @param slotName
     * @return
     */
    OperationWithResult get(String slotName);

    /**
     * 设置slot的值
     * @param slotName
     * @param value
     */
    Operation set(String slotName, CanVariable value);

    /**
     * 判断当前slot的值是否等于某个值
     * @param slotName
     * @param value
     * @return
     */
    Conditable eq(String slotName, CanVariable value);

    /**
     * 判断当前slot的值是否大于等于某个值
     * @param slotName
     * @param value
     * @return
     */
    Conditable ge(String slotName,CanVariable value);
}
