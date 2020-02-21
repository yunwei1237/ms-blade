package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetupQuestGiver implements Operation {

    private Variable questId;
    private Variable stringId;

    public SetupQuestGiver(Variable questId,Variable stringId) {
        this.questId = questId;
        this.stringId = stringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(setup_quest_giver,%s,%s),",questId,stringId);
    }
}
