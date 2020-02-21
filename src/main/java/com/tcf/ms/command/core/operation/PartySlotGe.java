package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class PartySlotGe implements Operation ,Conditable{

    private Variable partyId;
    private Variable slotNo;
    private Variable value;

    public PartySlotGe(Variable partyId,Variable slotNo,Variable value) {
        this.partyId = partyId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_slot_ge,%s,%s,%s),",partyId,slotNo,value);
    }
}
