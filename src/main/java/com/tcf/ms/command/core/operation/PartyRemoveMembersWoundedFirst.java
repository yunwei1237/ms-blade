package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyRemoveMembersWoundedFirst implements Operation {

    private Variable partyId;
    private Variable troopId;
    private Variable number;

    public PartyRemoveMembersWoundedFirst(Variable partyId,Variable troopId,Variable number) {
        this.partyId = partyId;
        this.troopId = troopId;
        this.number = number;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_remove_members_wounded_first,%s,%s,%s),",partyId,troopId,number);
    }
}
