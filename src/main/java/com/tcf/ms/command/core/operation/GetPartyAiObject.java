package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class GetPartyAiObject implements Operation {

    private Variable destination;
    private Variable partyId;

    public GetPartyAiObject(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_party_ai_object,%s,%s),",destination,partyId);
    }
}
