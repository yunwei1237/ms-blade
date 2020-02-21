package com.tcf.ms.command.core.operations.slot.ge;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class PartySlotGe implements Operation , Conditable {
    /**
     * 队伍
     */
    private Variable partyId;
    /**
     * slot编号
     */
    private Variable slotNo;
    /**
     * 值
     */
    private Variable value;

    public PartySlotGe(Variable partyId, Variable slotNo, Variable value) {
        this.partyId = partyId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_slot_ge,%s,%s,%s),",partyId,slotNo,value);
    }
}
