package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreRelation implements Operation {

    private Variable destination;
    private Variable factionId1;
    private Variable factionId2;

    public StoreRelation(Variable destination,Variable factionId1,Variable factionId2) {
        this.destination = destination;
        this.factionId1 = factionId1;
        this.factionId2 = factionId2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_relation,%s,%s,%s),",destination,factionId1,factionId2);
    }
}
