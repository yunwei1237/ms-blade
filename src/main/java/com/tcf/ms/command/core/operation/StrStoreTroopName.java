package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StrStoreTroopName implements Operation {

    private Variable stringRegister;
    private Variable troopId;

    public StrStoreTroopName(Variable stringRegister,Variable troopId) {
        this.stringRegister = stringRegister;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_troop_name,%s,%s),",stringRegister,troopId);
    }
}
