package com.tcf.ms.command.core.operations.slot.ge;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyTemplateSlotGe implements Operation , Conditable {
    /**
     * 阵营
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

    public PartyTemplateSlotGe(Variable partyTemplateId, Variable slotNo, Variable value) {
        this.partyTemplateId = partyTemplateId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_template_slot_ge,%s,%s,%s),",partyTemplateId,slotNo,value);
    }
}
