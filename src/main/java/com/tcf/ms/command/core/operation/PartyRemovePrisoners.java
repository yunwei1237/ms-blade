package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyRemovePrisoners implements Operation {

    private Variable partyId;
    private Variable troopId;
    private Variable number;

    public PartyRemovePrisoners(Variable partyId, Variable troopId, Variable number) {
        this.partyId = partyId;
        this.troopId = troopId;
        this.number = number;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_remove_prisoners,%s,%s,%s),",this.partyId,this.troopId,this.number);
    }
}
