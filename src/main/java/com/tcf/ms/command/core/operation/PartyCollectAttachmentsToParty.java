package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_collect_attachments_to_party, <party_id>, <destination party_id>),
 */
public class PartyCollectAttachmentsToParty implements Operation{

    private Variable partyId;
    private Variable destinationPartyId;

    public PartyCollectAttachmentsToParty(Variable partyId,Variable destinationPartyId) {
        this.partyId = partyId;
        this.destinationPartyId = destinationPartyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_collect_attachments_to_party,%s,%s),",partyId,destinationPartyId);
    }
}
