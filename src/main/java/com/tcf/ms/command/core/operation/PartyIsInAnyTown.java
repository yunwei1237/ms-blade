package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (party_is_in_any_town,<party_id>),
 */
public class PartyIsInAnyTown implements Conditable{

    private Variable partyId;

    public PartyIsInAnyTown(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_is_in_any_town,%s),",partyId);
    }
}
