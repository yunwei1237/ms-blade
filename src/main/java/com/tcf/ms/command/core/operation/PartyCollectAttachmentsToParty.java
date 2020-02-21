package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartyCollectAttachmentsToParty implements Operation {

    

    public PartyCollectAttachmentsToParty() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_collect_attachments_to_party),");
    }
}
