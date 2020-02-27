package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_entry_set_override_flags, <mission_template_id>, <entry_no>, <value>),
 */
public class MissionTplEntrySetOverrideFlags implements Operation{

    private Variable missionTemplateId;
    private Variable entryNo;
    private Variable value;

    public MissionTplEntrySetOverrideFlags(Variable missionTemplateId,Variable entryNo,Variable value) {
        this.missionTemplateId = missionTemplateId;
        this.entryNo = entryNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_tpl_entry_set_override_flags,%s,%s,%s),",missionTemplateId,entryNo,value);
    }
}
