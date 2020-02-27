package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (troop_slot_ge,<troop_id>,<slot_no>,<value>),
 */
public class TroopSlotGe implements Conditable{

    private Variable troopId;
    private Variable slotNo;
    private Variable value;

    public TroopSlotGe(Variable troopId,Variable slotNo,Variable value) {
        this.troopId = troopId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_slot_ge,%s,%s,%s),",troopId,slotNo,value);
    }
}
