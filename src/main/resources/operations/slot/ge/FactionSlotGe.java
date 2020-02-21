package com.tcf.ms.command.core.operations.slot.ge;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class FactionSlotGe implements Operation , Conditable {
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

    public FactionSlotGe(Variable factionId, Variable slotNo, Variable value) {
        this.factionId = factionId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(faction_slot_ge,%s,%s,%s),",factionId,slotNo,value);
    }
}
