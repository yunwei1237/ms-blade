package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (complete_quest,<quest_id>),
 */
public class CompleteQuest implements Operation{

    private Variable questId;

    public CompleteQuest(Variable questId) {
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(complete_quest,%s),",questId);
    }
}
