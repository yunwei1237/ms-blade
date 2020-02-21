package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyIsActive implements Operation , Conditable {
    /**
     * 队伍id
     */
    private Variable partyId;

    public PartyIsActive(Variable partyId) {
        this.partyId = partyId;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_is_active,%s),",partyId);
    }
}
