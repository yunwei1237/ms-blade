package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyQuickAttachToCurrentBattle implements Operation {

    private Variable partyId;
    private Variable side;

    public PartyQuickAttachToCurrentBattle(Variable partyId, Variable side) {
        this.partyId = partyId;
        this.side = side;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_quick_attach_to_current_battle,%s,%s),",this.partyId,this.side);
    }
}
