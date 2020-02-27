package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (party_template_slot_ge,<party_template_id>,<slot_no>,<value>),
 */
public class PartyTemplateSlotGe implements Conditable{

    private Variable partyTemplateId;
    private Variable slotNo;
    private Variable value;

    public PartyTemplateSlotGe(Variable partyTemplateId,Variable slotNo,Variable value) {
        this.partyTemplateId = partyTemplateId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_template_slot_ge,%s,%s,%s),",partyTemplateId,slotNo,value);
    }
}
