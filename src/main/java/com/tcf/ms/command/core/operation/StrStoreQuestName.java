package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StrStoreQuestName implements Operation {

    private Variable stringRegister;
    private Variable questId;

    public StrStoreQuestName(Variable stringRegister,Variable questId) {
        this.stringRegister = stringRegister;
        this.questId = questId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_quest_name,%s,%s),",stringRegister,questId);
    }
}
