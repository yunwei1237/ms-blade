package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_get_inventory_capacity,<destination>,<troop_id>),
 */
public class TroopGetInventoryCapacity implements Operation{

    private Variable destination;
    private Variable troopId;

    public TroopGetInventoryCapacity(Variable destination,Variable troopId) {
        this.destination = destination;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_get_inventory_capacity,%s,%s),",destination,troopId);
    }
}
