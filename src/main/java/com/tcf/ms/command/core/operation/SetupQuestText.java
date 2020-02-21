package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetupQuestText implements Operation {

    private Variable questId;

    public SetupQuestText(Variable questId) {
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(setup_quest_text,%s),",questId);
    }
}
