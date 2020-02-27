package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (heal_party,<party_id>),
 */
public class HealParty implements Operation{

    private Variable partyId;

    public HealParty(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(heal_party,%s),",partyId);
    }
}
