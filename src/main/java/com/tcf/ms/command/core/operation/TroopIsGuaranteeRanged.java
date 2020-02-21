package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class TroopIsGuaranteeRanged implements Operation ,Conditable{

    private Variable troopId;

    public TroopIsGuaranteeRanged(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_is_guarantee_ranged,%s),",troopId);
    }
}
