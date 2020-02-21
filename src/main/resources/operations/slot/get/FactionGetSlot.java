package com.tcf.ms.command.core.operations.slot.get;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class FactionGetSlot implements Operation {
    /**
     * 变量
     */
    private Variable destination;
    /**
     * 阵营
     */
    private Variable factionId;
    /**
     * slot编号
     */
    private Variable slotNo;


    public FactionGetSlot(Variable destination, Variable factionId, Variable slotNo) {
        this.destination = destination;
        this.factionId = factionId;
        this.slotNo = slotNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(faction_get_slot,%s,%s,%s),",destination,factionId,slotNo);
    }
}
