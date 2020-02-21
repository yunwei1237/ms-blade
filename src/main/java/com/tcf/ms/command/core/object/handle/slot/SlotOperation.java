package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.Conditable;

/**
 * slot的抽象操作
 */
public interface SlotOperation {
    /**
     * 获得slot的值
     * @param slotName
     * @return
     */
    <T> T get(String slotName,Class<? extends CanVariable> clazz);

    /**
     * 设置slot的值
     * @param slotName
     * @param value
     */
    void set(String slotName, CanVariable value);

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
