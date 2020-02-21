package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ResetMissionTimerC implements Operation {

    

    public ResetMissionTimerC() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(reset_mission_timer_c),");
    }
}
