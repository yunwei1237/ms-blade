package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (troop_slot_eq,<troop_id>,<slot_no>,<value>),
 */
public class TroopSlotEq implements Conditable{

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
