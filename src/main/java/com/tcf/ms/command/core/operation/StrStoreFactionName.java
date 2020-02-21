package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StrStoreFactionName implements Operation {

    private Variable stringRegister;
    private Variable factionId;

    public StrStoreFactionName(Variable stringRegister,Variable factionId) {
        this.stringRegister = stringRegister;
        this.factionId = factionId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_faction_name,%s,%s),",stringRegister,factionId);
    }
}
