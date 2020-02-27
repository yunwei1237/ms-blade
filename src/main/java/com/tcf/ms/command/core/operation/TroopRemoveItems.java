package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   puts cost of items to reg0  (troop_remove_items,<troop_id>,<item_id>,<number>),
 */
public class TroopRemoveItems implements Operation{

    private Variable troopId;
    private Variable itemId;
    private Variable number;

    public TroopRemoveItems(Variable troopId,Variable itemId,Variable number) {
        this.troopId = troopId;
        this.itemId = itemId;
        this.number = number;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_remove_items,%s,%s,%s),",troopId,itemId,number);
    }
}
