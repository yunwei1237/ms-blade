package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyGetAiTargetPosition implements Operation {

    private Variable positionNo;
    private Variable partyId;

    public PartyGetAiTargetPosition(Variable positionNo,Variable partyId) {
        this.positionNo = positionNo;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_ai_target_position,%s,%s),",positionNo,partyId);
    }
}
