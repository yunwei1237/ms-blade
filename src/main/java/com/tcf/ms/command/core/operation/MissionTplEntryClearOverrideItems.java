package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionTplEntryClearOverrideItems implements Operation {

    

    public MissionTplEntryClearOverrideItems() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_tpl_entry_clear_override_items),");
    }
}
