package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreDistanceToPartyFromParty implements Operation {

    private Variable destination;
    private Variable partyId;
    private Variable partyId2;

    public StoreDistanceToPartyFromParty(Variable destination,Variable partyId,Variable partyId2) {
        this.destination = destination;
        this.partyId = partyId;
        this.partyId2 = partyId2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_distance_to_party_from_party,%s,%s,%s),",destination,partyId,partyId2);
    }
}
