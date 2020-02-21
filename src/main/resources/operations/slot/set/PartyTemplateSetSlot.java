package com.tcf.ms.command.core.operations.slot.set;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyTemplateSetSlot implements Operation {
    /**
     * 队伍模板
     */
    private Variable partyTemplateId;
    /**
     * slot编号
     */
    private Variable slotNo;
    /**
     * 值
     */
    private Variable value;

    public PartyTemplateSetSlot(Variable partyTemplateId, Variable slotNo, Variable value) {
        this.partyTemplateId = partyTemplateId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_template_set_slot,%s,%s,%s),",partyTemplateId,slotNo,value);
    }
}
