package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class RemoveTroopsFromCompanions implements Operation {

    private Variable troopId;
    private Variable value;

    public RemoveTroopsFromCompanions(Variable troopId,Variable value) {
        this.troopId = troopId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(remove_troops_from_companions,%s,%s),",troopId,value);
    }
}
