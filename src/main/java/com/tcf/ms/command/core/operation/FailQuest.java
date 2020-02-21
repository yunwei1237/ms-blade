package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class FailQuest implements Operation {

    private Variable questId;

    public FailQuest(Variable questId) {
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(fail_quest,%s),",questId);
    }
}
