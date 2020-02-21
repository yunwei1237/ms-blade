package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopGetXp implements Operation {

    private Variable destination;
    private Variable troopId;

    public TroopGetXp(Variable destination,Variable troopId) {
        this.destination = destination;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_get_xp,%s,%s),",destination,troopId);
    }
}
