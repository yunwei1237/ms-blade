package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (check_quest_succeeded,<quest_id>),
 */
public class CheckQuestSucceeded implements Conditable{

    private Variable questId;

    public CheckQuestSucceeded(Variable questId) {
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(check_quest_succeeded,%s),",questId);
    }
}
