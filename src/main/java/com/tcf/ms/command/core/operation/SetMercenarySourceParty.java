package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   selects party from which to buy mercenaries  (set_mercenary_source_party,<party_id>),
 */
public class SetMercenarySourceParty implements Operation{

    private Variable partyId;

    public SetMercenarySourceParty(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_mercenary_source_party,%s),",partyId);
    }
}
