package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyGetNumPrisonerStacks implements Operation {

    private Variable destination;
    private Variable partyId;

    public PartyGetNumPrisonerStacks(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_num_prisoner_stacks,%s,%s),",destination,partyId);
    }
}
