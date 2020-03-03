package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (check_quest_finished,<quest_id>),
 */
public class CheckQuestFinished implements Conditable{

    private Variable questId;

    public CheckQuestFinished(Variable questId) {
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(check_quest_finished,%s),",questId);
    }
}
