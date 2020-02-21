package com.tcf.ms.command.core.operations.slot.get;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class QuestGetSlot implements Operation {
    /**
     * 变量
     */
    private Variable destination;
    /**
     * 兵种
     */
    private Variable questId;
    /**
     * slot编号
     */
    private Variable slotNo;


    public QuestGetSlot(Variable destination, Variable questId, Variable slotNo) {
        this.destination = destination;
        this.questId = questId;
        this.slotNo = slotNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(quest_get_slot,%s,%s,%s),",destination,questId,slotNo);
    }
}