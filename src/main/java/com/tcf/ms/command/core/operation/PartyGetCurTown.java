package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_get_cur_town, <destination>, <party_id>),
 */
public class PartyGetCurTown implements Operation{

    private Variable destination;
    private Variable partyId;

    public PartyGetCurTown(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_cur_town,%s,%s),",destination,partyId);
    }
}
