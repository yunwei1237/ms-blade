package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetPlayerTroop implements Operation {
    /**
     * 兵种Id
     * */
    private Variable troopId;

    public SetPlayerTroop(Variable townId) {
        this.troopId = troopId;
    }

    @Override
    public String toScriptString() {
        return String.format("(set_player_troop,%s),",troopId);
    }
}
