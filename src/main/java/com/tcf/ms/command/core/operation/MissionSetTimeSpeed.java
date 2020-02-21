package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionSetTimeSpeed implements Operation {

    

    public MissionSetTimeSpeed() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_set_time_speed),");
    }
}
