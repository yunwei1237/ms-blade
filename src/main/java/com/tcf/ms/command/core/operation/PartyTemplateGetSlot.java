package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyTemplateGetSlot implements Operation {

    private Variable destination;
    private Variable partyTemplateId;
    private Variable slotNo;

    public PartyTemplateGetSlot(Variable destination,Variable partyTemplateId,Variable slotNo) {
        this.destination = destination;
        this.partyTemplateId = partyTemplateId;
        this.slotNo = slotNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_template_get_slot,%s,%s,%s),",destination,partyTemplateId,slotNo);
    }
}
