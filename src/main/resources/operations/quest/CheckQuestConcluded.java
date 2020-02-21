package com.tcf.ms.command.core.operations.quest;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class CheckQuestConcluded implements Operation, Conditable {
    /**
     * 任务id
     */
    private Variable questId;

    public CheckQuestConcluded(Variable questId) {
        this.questId = questId;
    }

    @Override
    public String toScriptString() {
        return String.format("(check_quest_active,%s),",questId);
    }
}