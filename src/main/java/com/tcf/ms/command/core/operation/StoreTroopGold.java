package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreTroopGold implements Operation {

    private Variable destination;
    private Variable troopId;

    public StoreTroopGold(Variable destination,Variable troopId) {
        this.destination = destination;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_troop_gold,%s,%s),",destination,troopId);
    }
}
