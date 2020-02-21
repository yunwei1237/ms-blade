package com.tcf.ms.command.core.operations.slot.set;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class FactionSetSlot implements Operation {
    /**
     * 阵营
     */
    private Variable factionId;
    /**
     * slot编号
     */
    private Variable slotNo;
    /**
     * 值
     */
    private Variable value;

    public FactionSetSlot(Variable factionId, Variable slotNo, Variable value) {
        this.factionId = factionId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(faction_set_slot,%s,%s,%s),",factionId,slotNo,value);
    }
}
