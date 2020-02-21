package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StorePartySize implements Operation {

    private Variable destination;
    private Variable partyId;

    public StorePartySize(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_party_size,%s,%s),",destination,partyId);
    }
}
