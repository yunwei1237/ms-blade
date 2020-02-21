package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class MissionEntryClearOverrideItems implements Operation {

    private Variable missionTemplateId;
    private Variable entryNo;

    public MissionEntryClearOverrideItems(Variable missionTemplateId,Variable entryNo) {
        this.missionTemplateId = missionTemplateId;
        this.entryNo = entryNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_entry_clear_override_items,%s,%s),",missionTemplateId,entryNo);
    }
}
