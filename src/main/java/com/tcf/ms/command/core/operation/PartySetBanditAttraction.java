package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_set_bandit_attraction, <party_id>,<attaraction>),  set how attractive a target the party is for bandits (0..100)
 */
public class PartySetBanditAttraction implements Operation{

    private Variable partyId;
    private Variable attaraction;

    public PartySetBanditAttraction(Variable partyId,Variable attaraction) {
        this.partyId = partyId;
        this.attaraction = attaraction;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_bandit_attraction,%s,%s),",partyId,attaraction);
    }
}
