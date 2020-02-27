package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_add_xp, <party_id>, <xp_amount>),
 */
public class PartyAddXp implements Operation{

    private Variable partyId;
    private Variable xpAmount;

    public PartyAddXp(Variable partyId,Variable xpAmount) {
        this.partyId = partyId;
        this.xpAmount = xpAmount;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_add_xp,%s,%s),",partyId,xpAmount);
    }
}
