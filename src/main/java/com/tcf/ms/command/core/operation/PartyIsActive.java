package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class PartyIsActive implements Operation ,Conditable{

    private Variable partyId;

    public PartyIsActive(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_is_active,%s),",partyId);
    }
}
