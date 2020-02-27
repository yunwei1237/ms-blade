package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_mum_regular_prisoners,<destination>,<party_id>),
 */
public class StoreNumRegularPrisoners implements Operation{

    private Variable destination;
    private Variable partyId;

    public StoreNumRegularPrisoners(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_num_regular_prisoners,%s,%s),",destination,partyId);
    }
}
