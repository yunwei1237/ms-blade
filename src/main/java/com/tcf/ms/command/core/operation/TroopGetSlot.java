package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopGetSlot implements Operation {

    private Variable destination;
    private Variable troopId;
    private Variable slotNo;

    public TroopGetSlot(Variable destination,Variable troopId,Variable slotNo) {
        this.destination = destination;
        this.troopId = troopId;
        this.slotNo = slotNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_get_slot,%s,%s,%s),",destination,troopId,slotNo);
    }
}
