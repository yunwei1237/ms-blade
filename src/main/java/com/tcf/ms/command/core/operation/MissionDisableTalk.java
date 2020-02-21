package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionDisableTalk implements Operation {

    

    public MissionDisableTalk() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_disable_talk),");
    }
}
