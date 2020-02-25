package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyPrisonerStackGetTroopId implements Operation {

    private Variable destination;
    private Variable partyId;
    private Variable stackNo;

    public PartyPrisonerStackGetTroopId(Variable destination, Variable partyId, Variable stackNo) {
        this.destination = destination;
        this.partyId = partyId;
        this.stackNo = stackNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_prisoner_stack_get_troop_id,%s,%s,%s),",this.destination, this.partyId,this.stackNo);
    }
}
