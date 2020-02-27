package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_get_type,<destination>,<troop_id>),
 */
public class TroopGetType implements Operation{

    private Variable destination;
    private Variable troopId;

    public TroopGetType(Variable destination,Variable troopId) {
        this.destination = destination;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_get_type,%s,%s),",destination,troopId);
    }
}
