package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_get_current_terrain,<destination>,<party_id>),
 */
public class PartyGetCurrentTerrain implements Operation{

    private Variable destination;
    private Variable partyId;

    public PartyGetCurrentTerrain(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_current_terrain,%s,%s),",destination,partyId);
    }
}
