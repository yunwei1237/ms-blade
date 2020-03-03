package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (item_slot_eq,<item_id>,<slot_no>,<value>),
 */
public class ItemSlotEq implements Conditable{

    private Variable itemId;
    private Variable slotNo;
    private Variable value;

    public ItemSlotEq(Variable itemId,Variable slotNo,Variable value) {
        this.itemId = itemId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(item_slot_eq,%s,%s,%s),",itemId,slotNo,value);
    }
}
