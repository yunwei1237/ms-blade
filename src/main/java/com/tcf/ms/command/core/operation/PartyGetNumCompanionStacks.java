package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_get_num_companion_stacks,<destination>,<party_id>),
 */
public class PartyGetNumCompanionStacks implements Operation{

    private Variable destination;
    private Variable partyId;

    public PartyGetNumCompanionStacks(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_num_companion_stacks,%s,%s),",destination,partyId);
    }
}
