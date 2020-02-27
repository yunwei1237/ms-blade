package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_store_quest_name_link,<string_register>,<faction_id>),
 */
public class StrStoreQuestNameLink implements Operation{

    private Variable stringRegister;
    private Variable factionId;

    public StrStoreQuestNameLink(Variable stringRegister,Variable factionId) {
        this.stringRegister = stringRegister;
        this.factionId = factionId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_quest_name_link,%s,%s),",stringRegister,factionId);
    }
}
