package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_count_prisoners_of_type,<destination>,<party_id>,<troop_id>),
 */
public class PartyCountPrisonersOfType implements Operation{

    private Variable destination;
    private Variable partyId;
    private Variable troopId;

    public PartyCountPrisonersOfType(Variable destination,Variable partyId,Variable troopId) {
        this.destination = destination;
        this.partyId = partyId;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_count_prisoners_of_type,%s,%s,%s),",destination,partyId,troopId);
    }
}
