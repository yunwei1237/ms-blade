package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   stores number removed to reg0  (party_remove_members,<party_id>,<troop_id>,<number>),
 */
public class PartyRemovePrisoners implements Operation{

    private Variable partyId;
    private Variable troopId;
    private Variable number;

    public PartyRemovePrisoners(Variable partyId,Variable troopId,Variable number) {
        this.partyId = partyId;
        this.troopId = troopId;
        this.number = number;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_remove_prisoners,%s,%s,%s),",partyId,troopId,number);
    }
}
