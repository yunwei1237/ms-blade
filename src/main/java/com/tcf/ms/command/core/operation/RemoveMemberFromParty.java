package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class RemoveMemberFromParty implements Operation {

    private Variable troopId;
    private Variable partyId;

    public RemoveMemberFromParty(Variable troopId,Variable partyId) {
        this.troopId = troopId;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(remove_member_from_party,%s,%s),",troopId,partyId);
    }
}
