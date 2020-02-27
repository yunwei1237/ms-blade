package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_set_position,<party_id>,<position_no>),
 */
public class PartySetPosition implements Operation{

    private Variable partyId;
    private Variable positionNo;

    public PartySetPosition(Variable partyId,Variable positionNo) {
        this.partyId = partyId;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_position,%s,%s),",partyId,positionNo);
    }
}
