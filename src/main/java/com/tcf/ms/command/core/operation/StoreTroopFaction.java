package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreTroopFaction implements Operation {

    private Variable destination;
    private Variable troopId;

    public StoreTroopFaction(Variable destination,Variable troopId) {
        this.destination = destination;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_troop_faction,%s,%s),",destination,troopId);
    }
}
