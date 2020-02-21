package com.tcf.ms.command.core.operations.slot.set;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class QuestSetSlot implements Operation {
    /**
     * 任务
     */
    private Variable questId;
    /**
     * slot编号
     */
    private Variable slotNo;
    /**
     * 值
     */
    private Variable value;

    public QuestSetSlot(Variable questId, Variable slotNo, Variable value) {
        this.questId = questId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(quest_set_slot,%s,%s,%s),",questId,slotNo,value);
    }
}
