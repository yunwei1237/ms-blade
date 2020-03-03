package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (troop_is_mounted,<troop_id>),
 */
public class TroopIsMounted implements Conditable{

    private Variable troopId;

    public TroopIsMounted(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_is_mounted,%s),",troopId);
    }
}
