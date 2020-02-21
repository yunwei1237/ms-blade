package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionTplEntryAddOverrideItem implements Operation {

    

    public MissionTplEntryAddOverrideItem() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_tpl_entry_add_override_item),");
    }
}
