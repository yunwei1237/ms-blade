package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class TroopSlotEq implements Operation ,Conditable{

    private Variable troopId;
    private Variable slotNo;
    private Variable value;

    public TroopSlotEq(Variable troopId,Variable slotNo,Variable value) {
        this.troopId = troopId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_slot_eq,%s,%s,%s),",troopId,slotNo,value);
    }
}
