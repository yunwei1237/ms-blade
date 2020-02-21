package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopEquipItems implements Operation {

    private Variable troopId;

    public TroopEquipItems(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_equip_items,%s),",troopId);
    }
}
