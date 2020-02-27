package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_num_free_prisoner_stacks,<destination>,<party_id>),
 */
public class StoreNumFreePrisonerStacks implements Operation{

    private Variable destination;
    private Variable partyId;

    public StoreNumFreePrisonerStacks(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_num_free_prisoner_stacks,%s,%s),",destination,partyId);
    }
}
