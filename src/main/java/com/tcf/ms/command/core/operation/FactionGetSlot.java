package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (faction_get_slot,<destination>,<faction_id>,<slot_no>),
 */
public class FactionGetSlot implements Operation{

    private Variable destination;
    private Variable factionId;
    private Variable slotNo;

    public FactionGetSlot(Variable destination,Variable factionId,Variable slotNo) {
        this.destination = destination;
        this.factionId = factionId;
        this.slotNo = slotNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(faction_get_slot,%s,%s,%s),",destination,factionId,slotNo);
    }
}
