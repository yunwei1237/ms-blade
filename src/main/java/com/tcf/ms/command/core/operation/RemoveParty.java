package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class RemoveParty implements Operation {

    private Variable partyId;

    public RemoveParty(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(remove_party,%s),",partyId);
    }
}
