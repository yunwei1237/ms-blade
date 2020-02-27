package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_entry_add_override_item, <mission_template_id>, <entry_no>, <item_kind_id>),
 */
public class MissionTplEntryAddOverrideItem implements Operation{

    private Variable missionTemplateId;
    private Variable entryNo;
    private Variable itemKindId;

    public MissionTplEntryAddOverrideItem(Variable missionTemplateId,Variable entryNo,Variable itemKindId) {
        this.missionTemplateId = missionTemplateId;
        this.entryNo = entryNo;
        this.itemKindId = itemKindId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_tpl_entry_add_override_item,%s,%s,%s),",missionTemplateId,entryNo,itemKindId);
    }
}
