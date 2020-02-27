package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_get_attached_party_with_rank, <destination>, <party_id>, <attached_party_no>),
 */
public class PartyGetAttachedPartyWithRank implements Operation{

    private Variable destination;
    private Variable partyId;
    private Variable attachedPartyNo;

    public PartyGetAttachedPartyWithRank(Variable destination,Variable partyId,Variable attachedPartyNo) {
        this.destination = destination;
        this.partyId = partyId;
        this.attachedPartyNo = attachedPartyNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_attached_party_with_rank,%s,%s,%s),",destination,partyId,attachedPartyNo);
    }
}
