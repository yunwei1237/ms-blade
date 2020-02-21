package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreCharacterLevel implements Operation {

    private Variable destination;
    private Variable troopId;

    public StoreCharacterLevel(Variable destination,Variable troopId) {
        this.destination = destination;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_character_level,%s,%s),",destination,troopId);
    }
}
