package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_troop_value,<destination>,<troop_id>),
 */
public class StoreTroopValue implements Operation{

    private Variable destination;
    private Variable troopId;

    public StoreTroopValue(Variable destination,Variable troopId) {
        this.destination = destination;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_troop_value,%s,%s),",destination,troopId);
    }
}
