package com.tcf.ms.command.core.operations.slot.get;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopGetSlot implements Operation {
    /**
     * 变量
     */
    private Variable destination;
    /**
     * 兵种
     */
    private Variable troopId;
    /**
     * slot编号
     */
    private Variable slotNo;


    public TroopGetSlot(Variable destination,Variable troopId, Variable slotNo) {
        this.destination = destination;
        this.troopId = troopId;
        this.slotNo = slotNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_get_slot,%s,%s,%s),",destination,troopId,slotNo);
    }
}
