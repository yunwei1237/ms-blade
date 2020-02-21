package com.tcf.ms.command.core.operations.slot.ge;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class QuestSlotGe implements Operation , Conditable {
    /**
     * 阵营
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

    public QuestSlotGe(Variable questId, Variable slotNo, Variable value) {
        this.questId = questId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(quest_slot_ge,%s,%s,%s),",questId,slotNo,value);
    }
}
