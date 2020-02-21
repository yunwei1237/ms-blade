package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyRelocateNearParty implements Operation {

    private Variable partyId;
    private Variable targetPartyId;
    private Variable valueSpawnRadius;

    public PartyRelocateNearParty(Variable partyId,Variable targetPartyId,Variable valueSpawnRadius) {
        this.partyId = partyId;
        this.targetPartyId = targetPartyId;
        this.valueSpawnRadius = valueSpawnRadius;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_relocate_near_party,%s,%s,%s),",partyId,targetPartyId,valueSpawnRadius);
    }
}
