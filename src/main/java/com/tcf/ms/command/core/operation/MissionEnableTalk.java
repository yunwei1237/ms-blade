package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionEnableTalk implements Operation {

    

    public MissionEnableTalk() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_enable_talk),");
    }
}
