package com.tcf.ms.command.core.operations.slot.eq;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class QuestSlotEq implements Operation , Conditable {
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

    public QuestSlotEq(Variable questId, Variable slotNo, Variable value) {
        this.questId = questId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(quest_slot_eq,%s,%s,%s),",questId,slotNo,value);
    }
}
