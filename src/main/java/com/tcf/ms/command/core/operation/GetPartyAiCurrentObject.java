package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (get_party_ai_current_object,<destination>,<party_id>),
 */
public class GetPartyAiCurrentObject implements Operation{

    private Variable destination;
    private Variable partyId;

    public GetPartyAiCurrentObject(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_party_ai_current_object,%s,%s),",destination,partyId);
    }
}
