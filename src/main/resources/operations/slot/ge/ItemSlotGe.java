package com.tcf.ms.command.core.operations.slot.ge;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class ItemSlotGe implements Operation , Conditable {
    /**
     * 阵营
     */
    private Variable itemId;
    /**
     * slot编号
     */
    private Variable slotNo;
    /**
     * 值
     */
    private Variable value;

    public ItemSlotGe(Variable itemId, Variable slotNo, Variable value) {
        this.itemId = itemId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(item_slot_ge,%s,%s,%s),",itemId,slotNo,value);
    }
}
