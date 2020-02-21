package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreAttributeLevel implements Operation {

    private Variable destination;
    private Variable troopId;
    private Variable attributeId;

    public StoreAttributeLevel(Variable destination,Variable troopId,Variable attributeId) {
        this.destination = destination;
        this.troopId = troopId;
        this.attributeId = attributeId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_attribute_level,%s,%s,%s),",destination,troopId,attributeId);
    }
}
