package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyAttachToParty implements Operation {

    private Variable partyId;
    private Variable partyIdToAttachTo;

    public PartyAttachToParty(Variable partyId, Variable partyIdToAttachTo) {
        this.partyId = partyId;
        this.partyIdToAttachTo = partyIdToAttachTo;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_attach_to_party,%s,%s),",this.partyId,this.partyIdToAttachTo);
    }
}
