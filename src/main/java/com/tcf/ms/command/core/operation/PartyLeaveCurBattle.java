package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyLeaveCurBattle implements Operation {

    private Variable partyId;

    public PartyLeaveCurBattle(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_leave_cur_battle,%s),",partyId);
    }
}
