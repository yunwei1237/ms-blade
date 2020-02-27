package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_troop_count_prisoners,<destination>,<troop_id>,[party_id]),
 */
public class StoreTroopCountPrisoners implements Operation{

    private Variable destination;
    private Variable troopId;
    private Variable partyId;

    public StoreTroopCountPrisoners(Variable destination,Variable troopId,Variable partyId) {
        this.destination = destination;
        this.troopId = troopId;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_troop_count_prisoners,%s,%s,%s),",destination,troopId,partyId);
    }
}
