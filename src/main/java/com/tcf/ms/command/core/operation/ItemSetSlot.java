package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class ItemSetSlot implements Operation {

    private Variable itemId;
    private Variable slotNo;
    private Variable value;

    public ItemSetSlot(Variable itemId,Variable slotNo,Variable value) {
        this.itemId = itemId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(item_set_slot,%s,%s,%s),",itemId,slotNo,value);
    }
}
