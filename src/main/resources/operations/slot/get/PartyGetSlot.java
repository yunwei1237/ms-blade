package com.tcf.ms.command.core.operations.slot.get;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyGetSlot implements Operation {
    /**
     * 变量
     */
    private Variable destination;
    /**
     * 队伍
     */
    private Variable partyId;
    /**
     * slot编号
     */
    private Variable slotNo;


    public PartyGetSlot(Variable destination, Variable partyId, Variable slotNo) {
        this.destination = destination;
        this.partyId = partyId;
        this.slotNo = slotNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_slot,%s,%s,%s),",destination,partyId,slotNo);
    }
}
