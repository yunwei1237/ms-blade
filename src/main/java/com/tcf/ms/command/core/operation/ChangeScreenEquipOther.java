package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class ChangeScreenEquipOther implements Operation {

    private Variable troopId;

    public ChangeScreenEquipOther(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_equip_other,%s),",troopId);
    }
}
