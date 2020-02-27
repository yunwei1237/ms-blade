package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_entry_clear_override_items, <mission_template_id>, <entry_no>),
 */
public class MissionTplEntryClearOverrideItems implements Operation{

    private Variable missionTemplateId;
    private Variable entryNo;

    public MissionTplEntryClearOverrideItems(Variable missionTemplateId,Variable entryNo) {
        this.missionTemplateId = missionTemplateId;
        this.entryNo = entryNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_tpl_entry_clear_override_items,%s,%s),",missionTemplateId,entryNo);
    }
}
