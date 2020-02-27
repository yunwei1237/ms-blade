package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_add_item,<troop_id>,<item_id>,[modifier]),
 */
public class TroopAddItem implements Operation{

    private Variable troopId;
    private Variable itemId;
    private Variable modifier;

    public TroopAddItem(Variable troopId,Variable itemId,Variable modifier) {
        this.troopId = troopId;
        this.itemId = itemId;
        this.modifier = modifier;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_add_item,%s,%s,%s),",troopId,itemId,modifier);
    }
}
