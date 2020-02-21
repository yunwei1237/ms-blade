package com.tcf.ms.command.core.operations.slot.get;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class ItemGetSlot implements Operation {
    /**
     * 变量
     */
    private Variable destination;
    /**
     * 兵种
     */
    private Variable itemId;
    /**
     * slot编号
     */
    private Variable slotNo;


    public ItemGetSlot(Variable destination, Variable itemId, Variable slotNo) {
        this.destination = destination;
        this.itemId = itemId;
        this.slotNo = slotNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(item_get_slot,%s,%s,%s),",destination,itemId,slotNo);
    }
}
