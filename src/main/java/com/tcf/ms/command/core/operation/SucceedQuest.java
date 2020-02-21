package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SucceedQuest implements Operation {

    private Variable questId;

    public SucceedQuest(Variable questId) {
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(succeed_quest,%s),",questId);
    }
}
