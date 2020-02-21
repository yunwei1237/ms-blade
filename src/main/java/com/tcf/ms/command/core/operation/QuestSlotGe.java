package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class QuestSlotGe implements Operation ,Conditable{

    private Variable questId;
    private Variable slotNo;
    private Variable value;

    public QuestSlotGe(Variable questId,Variable slotNo,Variable value) {
        this.questId = questId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(quest_slot_ge,%s,%s,%s),",questId,slotNo,value);
    }
}
