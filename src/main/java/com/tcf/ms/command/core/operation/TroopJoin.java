package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_join,<troop_id>),
 */
public class TroopJoin implements Operation{

    private Variable troopId;

    public TroopJoin(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_join,%s),",troopId);
    }
}
