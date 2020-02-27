package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_add_prisoners,<party_id>,<troop_id>,<number>), returns number added in reg0
 */
public class PartyAddPrisoners implements Operation{

    private Variable partyId;
    private Variable troopId;
    private Variable number;

    public PartyAddPrisoners(Variable partyId,Variable troopId,Variable number) {
        this.partyId = partyId;
        this.troopId = troopId;
        this.number = number;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_add_prisoners,%s,%s,%s),",partyId,troopId,number);
    }
}
