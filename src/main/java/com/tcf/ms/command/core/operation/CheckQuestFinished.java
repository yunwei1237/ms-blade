package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class CheckQuestFinished implements Operation ,Conditable{

    private Variable questId;

    public CheckQuestFinished(Variable questId) {
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(check_quest_finished,%s),",questId);
    }
}