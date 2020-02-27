package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (enable_party,<party_id>),
 */
public class EnableParty implements Operation{

    private Variable partyId;

    public EnableParty(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(enable_party,%s),",partyId);
    }
}
