package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreItemValue implements Operation {

    private Variable destination;
    private Variable itemId;

    public StoreItemValue(Variable destination,Variable itemId) {
        this.destination = destination;
        this.itemId = itemId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_item_value,%s,%s),",destination,itemId);
    }
}
