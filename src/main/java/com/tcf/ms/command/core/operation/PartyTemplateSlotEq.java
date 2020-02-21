package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class PartyTemplateSlotEq implements Operation ,Conditable{

    private Variable partyTemplateId;
    private Variable slotNo;
    private Variable value;

    public PartyTemplateSlotEq(Variable partyTemplateId,Variable slotNo,Variable value) {
        this.partyTemplateId = partyTemplateId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_template_slot_eq,%s,%s,%s),",partyTemplateId,slotNo,value);
    }
}