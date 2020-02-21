package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class FactionSlotEq implements Operation ,Conditable{

    private Variable factionId;
    private Variable slotNo;
    private Variable value;

    public FactionSlotEq(Variable factionId,Variable slotNo,Variable value) {
        this.factionId = factionId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(faction_slot_eq,%s,%s,%s),",factionId,slotNo,value);
    }
}
