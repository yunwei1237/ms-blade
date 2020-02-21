package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopIsGuaranteeHorse implements Operation , Conditable {
    /**
     * 兵种id
     */
    private Variable troopId;

    public TroopIsGuaranteeHorse(Variable troopId) {
        this.troopId = troopId;
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_is_guarantee_horse,%s),",troopId);
    }
}
