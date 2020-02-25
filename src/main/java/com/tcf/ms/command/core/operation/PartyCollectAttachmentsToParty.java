package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyCollectAttachmentsToParty implements Operation {

    private Variable partyId;
    private Variable destination;

    public PartyCollectAttachmentsToParty(Variable partyId, Variable destination) {
        this.partyId = partyId;
        this.destination = destination;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_collect_attachments_to_party,%s,%s),",partyId,destination);
    }
}
