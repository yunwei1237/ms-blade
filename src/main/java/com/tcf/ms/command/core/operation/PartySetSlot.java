package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartySetSlot implements Operation {

    private Variable partyId;
    private Variable slotNo;
    private Variable value;

    public PartySetSlot(Variable partyId,Variable slotNo,Variable value) {
        this.partyId = partyId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_slot,%s,%s,%s),",partyId,slotNo,value);
    }
}
