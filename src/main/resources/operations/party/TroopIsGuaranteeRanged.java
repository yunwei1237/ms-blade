package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopIsGuaranteeRanged implements Operation , Conditable {
    /**
     * 兵种id
     */
    private Variable troopId;

    public TroopIsGuaranteeRanged(Variable troopId) {
        this.troopId = troopId;
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_is_guarantee_ranged,%s),",troopId);
    }
}
