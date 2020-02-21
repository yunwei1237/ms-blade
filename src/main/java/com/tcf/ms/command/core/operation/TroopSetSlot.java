package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopSetSlot implements Operation {

    private Variable troopId;
    private Variable slotNo;
    private Variable value;

    public TroopSetSlot(Variable troopId,Variable slotNo,Variable value) {
        this.troopId = troopId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_set_slot,%s,%s,%s),",troopId,slotNo,value);
    }
}
