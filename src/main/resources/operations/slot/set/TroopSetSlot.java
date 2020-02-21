package com.tcf.ms.command.core.operations.slot.set;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopSetSlot implements Operation {
    /**
     * 兵种
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
