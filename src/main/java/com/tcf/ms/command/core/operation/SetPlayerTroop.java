package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_player_troop,<troop_id>),
 */
public class SetPlayerTroop implements Operation{

    private Variable troopId;

    public SetPlayerTroop(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_player_troop,%s),",troopId);
    }
}
