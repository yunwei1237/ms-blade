package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (change_screen_loot, <troop_id>),
 */
public class ChangeScreenLoot implements Operation{

    private Variable troopId;

    public ChangeScreenLoot(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_loot,%s),",troopId);
    }
}
