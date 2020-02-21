package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopAddItems implements Operation {

    private Variable troopId;
    private Variable itemId;
    private Variable number;

    public TroopAddItems(Variable troopId,Variable itemId,Variable number) {
        this.troopId = troopId;
        this.itemId = itemId;
        this.number = number;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_add_items,%s,%s,%s),",troopId,itemId,number);
    }
}
