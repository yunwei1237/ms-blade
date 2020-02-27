package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (disable_party,<party_id>),
 */
public class DisableParty implements Operation{

    private Variable partyId;

    public DisableParty(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(disable_party,%s),",partyId);
    }
}
