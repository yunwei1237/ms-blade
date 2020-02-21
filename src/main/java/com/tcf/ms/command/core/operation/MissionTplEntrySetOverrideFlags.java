package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionTplEntrySetOverrideFlags implements Operation {

    

    public MissionTplEntrySetOverrideFlags() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_tpl_entry_set_override_flags),");
    }
}
