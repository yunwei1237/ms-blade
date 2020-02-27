package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (item_get_slot,<destination>,<item_id>,<slot_no>),
 */
public class ItemGetSlot implements Operation{

    private Variable destination;
    private Variable itemId;
    private Variable slotNo;

    public ItemGetSlot(Variable destination,Variable itemId,Variable slotNo) {
        this.destination = destination;
        this.itemId = itemId;
        this.slotNo = slotNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(item_get_slot,%s,%s,%s),",destination,itemId,slotNo);
    }
}
