package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (party_can_join_party, <joiner_party_id>, <host_party_id>,[flip_prisoners]),
 */
public class PartyCanJoinParty implements Conditable{

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
