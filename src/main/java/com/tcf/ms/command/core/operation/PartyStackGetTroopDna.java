package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_stack_get_troop_dna,     <destination>,<party_id>,<stack_no>),
 */
public class PartyStackGetTroopDna implements Operation{

    private Variable destination;
    private Variable partyId;
    private Variable stackNo;

    public PartyStackGetTroopDna(Variable destination,Variable partyId,Variable stackNo) {
        this.destination = destination;
        this.partyId = partyId;
        this.stackNo = stackNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_stack_get_troop_dna,%s,%s,%s),",destination,partyId,stackNo);
    }
}
