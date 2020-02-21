package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyIgnorePlayer implements Operation {

    private Variable partyId;
    private Variable durationInHours;

    public PartyIgnorePlayer(Variable partyId,Variable durationInHours) {
        this.partyId = partyId;
        this.durationInHours = durationInHours;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_ignore_player,%s,%s),",partyId,durationInHours);
    }
}
