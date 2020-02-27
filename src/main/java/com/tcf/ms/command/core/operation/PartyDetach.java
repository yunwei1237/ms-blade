package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_detach, <party_id>),
 */
public class PartyDetach implements Operation{

    private Variable partyId;

    public PartyDetach(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_detach,%s),",partyId);
    }
}
