package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartySetAiBehavior implements Operation {

    private Variable partyId;
    private Variable aiBhvr;

    public PartySetAiBehavior(Variable partyId,Variable aiBhvr) {
        this.partyId = partyId;
        this.aiBhvr = aiBhvr;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_ai_behavior,%s,%s),",partyId,aiBhvr);
    }
}
