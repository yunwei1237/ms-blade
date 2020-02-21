package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopIsMounted implements Operation , Conditable {
    /**
     * 兵种id
     */
    private Variable troopId;

    public TroopIsMounted(Variable troopId) {
        this.troopId = troopId;
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_is_mounted,%s),",troopId);
    }
}
