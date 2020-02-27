package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_item_kind_count,<destination>,<item_id>,[troop_id]),
 */
public class StoreItemKindCount implements Operation{

    private Variable destination;
    private Variable itemId;
    private Variable troopId;

    public StoreItemKindCount(Variable destination,Variable itemId,Variable troopId) {
        this.destination = destination;
        this.itemId = itemId;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_item_kind_count,%s,%s,%s),",destination,itemId,troopId);
    }
}
