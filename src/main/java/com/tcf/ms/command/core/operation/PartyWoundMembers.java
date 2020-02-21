package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyWoundMembers implements Operation {

    private Variable partyId;
    private Variable troopId;
    private Variable number;

    public PartyWoundMembers(Variable partyId,Variable troopId,Variable number) {
        this.partyId = partyId;
        this.troopId = troopId;
        this.number = number;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_wound_members,%s,%s,%s),",partyId,troopId,number);
    }
}
