package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopRemoveItem implements Operation {

    private Variable troopId;
    private Variable itemId;

    public TroopRemoveItem(Variable troopId,Variable itemId) {
        this.troopId = troopId;
        this.itemId = itemId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_remove_item,%s,%s),",troopId,itemId);
    }
}
