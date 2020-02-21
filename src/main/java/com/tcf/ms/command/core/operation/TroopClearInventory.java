package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopClearInventory implements Operation {

    private Variable troopId;

    public TroopClearInventory(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_clear_inventory,%s),",troopId);
    }
}
