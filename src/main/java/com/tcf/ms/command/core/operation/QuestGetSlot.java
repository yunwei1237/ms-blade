package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (quest_get_slot,<destination>,<quest_id>,<slot_no>),
 */
public class QuestGetSlot implements Operation{

    private Variable destination;
    private Variable questId;
    private Variable slotNo;

    public QuestGetSlot(Variable destination,Variable questId,Variable slotNo) {
        this.destination = destination;
        this.questId = questId;
        this.slotNo = slotNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(quest_get_slot,%s,%s,%s),",destination,questId,slotNo);
    }
}
