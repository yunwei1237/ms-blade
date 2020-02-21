package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyAddXpToStack implements Operation {

    private Variable partyId;
    private Variable stackNo;
    private Variable xpAmount;

    public PartyAddXpToStack(Variable partyId,Variable stackNo,Variable xpAmount) {
        this.partyId = partyId;
        this.stackNo = stackNo;
        this.xpAmount = xpAmount;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_add_xp_to_stack,%s,%s,%s),",partyId,stackNo,xpAmount);
    }
}
