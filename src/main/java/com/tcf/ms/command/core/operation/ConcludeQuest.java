package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (conclude_quest,<quest_id>),
 */
public class ConcludeQuest implements Operation{

    private Variable questId;

    public ConcludeQuest(Variable questId) {
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(conclude_quest,%s),",questId);
    }
}
