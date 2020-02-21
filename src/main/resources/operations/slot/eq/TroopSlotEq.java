package com.tcf.ms.command.core.operations.slot.eq;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopSlotEq implements Operation , Conditable {
    /**
     * 场景中的人员
     */
    private Variable troopId;
    /**
     * slot编号
     */
    private Variable slotNo;
    /**
     * 值
     */
    private Variable value;

    public TroopSlotEq(Variable troopId, Variable slotNo, Variable value) {
        this.troopId = troopId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_slot_eq,%s,%s,%s),",troopId,slotNo,value);
    }
}
