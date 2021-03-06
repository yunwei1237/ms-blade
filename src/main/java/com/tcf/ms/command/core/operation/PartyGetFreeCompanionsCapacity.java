package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_get_free_companions_capacity,<destination>,<party_id>),
 */
public class PartyGetFreeCompanionsCapacity implements Operation{

    private Variable destination;
    private Variable partyId;

    public PartyGetFreeCompanionsCapacity(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_free_companions_capacity,%s,%s),",destination,partyId);
    }
}
