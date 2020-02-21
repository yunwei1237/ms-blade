package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyGetPrisonerStackTroop implements Operation {

    private Variable destination;
    private Variable partyId;
    private Variable stackNo;

    public PartyGetPrisonerStackTroop(Variable destination,Variable partyId,Variable stackNo) {
        this.destination = destination;
        this.partyId = partyId;
        this.stackNo = stackNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_prisoner_stack_troop,%s,%s,%s),",destination,partyId,stackNo);
    }
}
