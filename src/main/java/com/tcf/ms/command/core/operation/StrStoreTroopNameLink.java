package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StrStoreTroopNameLink implements Operation {

    private Variable stringRegister;
    private Variable troopId;

    public StrStoreTroopNameLink(Variable stringRegister,Variable troopId) {
        this.stringRegister = stringRegister;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_troop_name_link,%s,%s),",stringRegister,troopId);
    }
}
