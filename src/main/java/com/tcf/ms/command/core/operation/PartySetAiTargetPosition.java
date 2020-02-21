package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartySetAiTargetPosition implements Operation {

    private Variable partyId;
    private Variable positionNo;

    public PartySetAiTargetPosition(Variable partyId,Variable positionNo) {
        this.partyId = partyId;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_ai_target_position,%s,%s),",partyId,positionNo);
    }
}
