package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_stack_get_size,          <destination>,<party_id>,<stack_no>),
 */
public class PartyStackGetSize implements Operation{

    private Variable destination;
    private Variable partyId;
    private Variable stackNo;

    public PartyStackGetSize(Variable destination,Variable partyId,Variable stackNo) {
        this.destination = destination;
        this.partyId = partyId;
        this.stackNo = stackNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_stack_get_size,%s,%s,%s),",destination,partyId,stackNo);
    }
}
