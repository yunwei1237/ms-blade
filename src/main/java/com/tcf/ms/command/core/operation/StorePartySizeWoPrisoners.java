package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StorePartySizeWoPrisoners implements Operation {

    private Variable destination;
    private Variable partyId;

    public StorePartySizeWoPrisoners(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_party_size_wo_prisoners,%s,%s),",destination,partyId);
    }
}
