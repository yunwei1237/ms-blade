package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_get_num_attached_parties, <destination>, <party_id>),
 */
public class PartyGetNumAttachedParties implements Operation{

    private Variable destination;
    private Variable partyId;

    public PartyGetNumAttachedParties(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_num_attached_parties,%s,%s),",destination,partyId);
    }
}
