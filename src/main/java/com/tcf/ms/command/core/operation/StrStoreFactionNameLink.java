package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StrStoreFactionNameLink implements Operation {

    private Variable stringRegister;
    private Variable factionId;

    public StrStoreFactionNameLink(Variable stringRegister,Variable factionId) {
        this.stringRegister = stringRegister;
        this.factionId = factionId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_faction_name_link,%s,%s),",stringRegister,factionId);
    }
}
