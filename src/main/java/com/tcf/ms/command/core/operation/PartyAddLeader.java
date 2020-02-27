package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_add_leader,<party_id>,<troop_id>,[<number>]),
 */
public class PartyAddLeader implements Operation{

    private Variable partyId;
    private Variable troopId;
    private Variable number;

    public PartyAddLeader(Variable partyId,Variable troopId,Variable number) {
        this.partyId = partyId;
        this.troopId = troopId;
        this.number = number;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_add_leader,%s,%s,%s),",partyId,troopId,number);
    }
}
