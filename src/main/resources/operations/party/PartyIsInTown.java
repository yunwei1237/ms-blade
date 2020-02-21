package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyIsInTown implements Operation, Conditable {
    /**
     * 队伍id
     */
    private Variable partyId1;
    /**
     * 城镇id
     */
    private Variable partyId2;

    public PartyIsInTown(Variable partyId1,Variable partyId2) {
        this.partyId1 = partyId1;
        this.partyId2 = partyId2;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_is_in_town,%s,%s),",partyId1,partyId2);
    }
}
