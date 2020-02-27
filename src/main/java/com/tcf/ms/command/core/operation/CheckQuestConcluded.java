package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (check_quest_concluded,<quest_id>),
 */
public class CheckQuestConcluded implements Conditable{

    private Variable questId;

    public CheckQuestConcluded(Variable questId) {
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(check_quest_concluded,%s),",questId);
    }
}
