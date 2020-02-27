package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_sort_inventory,<troop_id>),
 */
public class TroopSortInventory implements Operation{

    private Variable troopId;

    public TroopSortInventory(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_sort_inventory,%s),",troopId);
    }
}
