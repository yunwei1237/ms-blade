package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreTroopHealth implements Operation {

    private Variable destination;
    private Variable troopId;
    private Variable absolute;

    public StoreTroopHealth(Variable destination,Variable troopId,Variable absolute) {
        this.destination = destination;
        this.troopId = troopId;
        this.absolute = absolute;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_troop_health,%s,%s,%s),",destination,troopId,absolute);
    }
}
