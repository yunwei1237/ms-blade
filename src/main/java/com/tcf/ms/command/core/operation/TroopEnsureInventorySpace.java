package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopEnsureInventorySpace implements Operation {

    private Variable troopId;
    private Variable value;

    public TroopEnsureInventorySpace(Variable troopId,Variable value) {
        this.troopId = troopId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_ensure_inventory_space,%s,%s),",troopId,value);
    }
}
