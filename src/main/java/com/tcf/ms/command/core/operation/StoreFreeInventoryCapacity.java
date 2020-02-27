package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_free_inventory_capacity,<destination>,[troop_id]),
 */
public class StoreFreeInventoryCapacity implements Operation{

    private Variable destination;
    private Variable troopId;

    public StoreFreeInventoryCapacity(Variable destination,Variable troopId) {
        this.destination = destination;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_free_inventory_capacity,%s,%s),",destination,troopId);
    }
}
