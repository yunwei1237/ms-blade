package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class GetPartyAiCurrentBehavior implements Operation {

    private Variable destination;
    private Variable partyId;

    public GetPartyAiCurrentBehavior(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_party_ai_current_behavior,%s,%s),",destination,partyId);
    }
}
