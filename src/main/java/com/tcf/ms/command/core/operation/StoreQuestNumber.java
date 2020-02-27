package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_quest_number,<destination>,<quest_id>),
 */
public class StoreQuestNumber implements Operation{

    private Variable destination;
    private Variable questId;

    public StoreQuestNumber(Variable destination,Variable questId) {
        this.destination = destination;
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_quest_number,%s,%s),",destination,questId);
    }
}
