package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyTemplateSetSlot implements Operation {

    private Variable partyTemplateId;
    private Variable slotNo;
    private Variable value;

    public PartyTemplateSetSlot(Variable partyTemplateId,Variable slotNo,Variable value) {
        this.partyTemplateId = partyTemplateId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_template_set_slot,%s,%s,%s),",partyTemplateId,slotNo,value);
    }
}
