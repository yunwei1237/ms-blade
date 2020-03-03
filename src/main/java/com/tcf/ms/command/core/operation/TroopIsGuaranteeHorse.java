package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (troop_is_guarantee_horse, <troop_id>),
 */
public class TroopIsGuaranteeHorse implements Conditable{

    private Variable troopId;

    public TroopIsGuaranteeHorse(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_is_guarantee_horse,%s),",troopId);
    }
}
