package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (quest_set_slot,<quest_id>,<slot_no>,<value>),
 */
public class QuestSetSlot implements Operation{

    private Variable questId;
    private Variable slotNo;
    private Variable value;

    public QuestSetSlot(Variable questId,Variable slotNo,Variable value) {
        this.questId = questId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(quest_set_slot,%s,%s,%s),",questId,slotNo,value);
    }
}
