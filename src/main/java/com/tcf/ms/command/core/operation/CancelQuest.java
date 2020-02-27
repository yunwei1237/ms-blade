package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cancel_quest,<quest_id>),
 */
public class CancelQuest implements Operation{

    private Variable questId;

    public CancelQuest(Variable questId) {
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cancel_quest,%s),",questId);
    }
}
