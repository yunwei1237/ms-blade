package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class TroopIsMounted implements Operation ,Conditable{

    private Variable troopId;

    public TroopIsMounted(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_is_mounted,%s),",troopId);
    }
}
