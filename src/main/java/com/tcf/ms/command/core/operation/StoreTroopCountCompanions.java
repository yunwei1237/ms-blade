package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreTroopCountCompanions implements Operation {

    private Variable destination;
    private Variable troopId;
    private Variable partyId;

    public StoreTroopCountCompanions(Variable destination,Variable troopId,Variable partyId) {
        this.destination = destination;
        this.troopId = troopId;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_troop_count_companions,%s,%s,%s),",destination,troopId,partyId);
    }
}
