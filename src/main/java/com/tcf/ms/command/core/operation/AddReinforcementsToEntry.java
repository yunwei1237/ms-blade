package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddReinforcementsToEntry implements Operation {

    private Variable missionTemplateEntryNo;
    private Variable value;

    public AddReinforcementsToEntry(Variable missionTemplateEntryNo,Variable value) {
        this.missionTemplateEntryNo = missionTemplateEntryNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_reinforcements_to_entry,%s,%s),",missionTemplateEntryNo,value);
    }
}
