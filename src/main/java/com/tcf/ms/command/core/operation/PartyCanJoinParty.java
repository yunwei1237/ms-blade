package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyCanJoinParty implements Operation, Conditable {

    private Variable joinerPartyId;
    private Variable hostPartyId;
    private Variable flipPrisoners;

    public PartyCanJoinParty(Variable joinerPartyId,Variable hostPartyId,Variable flipPrisoners) {
        this.joinerPartyId = joinerPartyId;
        this.hostPartyId = hostPartyId;
        this.flipPrisoners = flipPrisoners;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_can_join_party,%s,%s,%s),",joinerPartyId,hostPartyId,flipPrisoners);
    }
}
