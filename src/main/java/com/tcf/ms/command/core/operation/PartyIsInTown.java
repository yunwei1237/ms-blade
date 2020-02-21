package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class PartyIsInTown implements Operation ,Conditable{

    private Variable partyId1;
    private Variable partyId2;

    public PartyIsInTown(Variable partyId1,Variable partyId2) {
        this.partyId1 = partyId1;
        this.partyId2 = partyId2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_is_in_town,%s,%s),",partyId1,partyId2);
    }
}
