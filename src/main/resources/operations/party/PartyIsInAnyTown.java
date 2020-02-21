package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyIsInAnyTown implements Operation , Conditable {
    /**
     * 队伍id
     */
    private Variable partyId1;

    public PartyIsInAnyTown(Variable partyId1) {
        this.partyId1 = partyId1;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_is_in_any_town,%s),",partyId1);
    }
}
