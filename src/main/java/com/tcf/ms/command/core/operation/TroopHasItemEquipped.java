package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (troop_has_item_equipped,<troop_id>,<item_id>),
 */
public class TroopHasItemEquipped implements Conditable{

    private Variable troopId;
    private Variable itemId;

    public TroopHasItemEquipped(Variable troopId,Variable itemId) {
        this.troopId = troopId;
        this.itemId = itemId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_has_item_equipped,%s,%s),",troopId,itemId);
    }
}
