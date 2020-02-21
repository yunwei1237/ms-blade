package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopRaiseSkill implements Operation {

    private Variable troopId;
    private Variable skillId;
    private Variable value;

    public TroopRaiseSkill(Variable troopId,Variable skillId,Variable value) {
        this.troopId = troopId;
        this.skillId = skillId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_raise_skill,%s,%s,%s),",troopId,skillId,value);
    }
}
