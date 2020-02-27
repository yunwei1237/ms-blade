package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_join_as_prisoner,<troop_id>),
 */
public class TroopJoinAsPrisoner implements Operation{

    private Variable troopId;

    public TroopJoinAsPrisoner(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_join_as_prisoner,%s),",troopId);
    }
}
