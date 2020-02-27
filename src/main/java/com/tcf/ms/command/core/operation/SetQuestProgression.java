package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_quest_progression,<quest_id>,<value>),
 */
public class SetQuestProgression implements Operation{

    private Variable questId;
    private Variable value;

    public SetQuestProgression(Variable questId,Variable value) {
        this.questId = questId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_quest_progression,%s,%s),",questId,value);
    }
}
