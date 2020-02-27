package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_get_position,<position_no>,<party_id>),
 */
public class PartyGetPosition implements Operation{

    private Variable positionNo;
    private Variable partyId;

    public PartyGetPosition(Variable positionNo,Variable partyId) {
        this.positionNo = positionNo;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_position,%s,%s),",positionNo,partyId);
    }
}
