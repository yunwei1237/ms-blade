package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ResetMissionTimerB implements Operation {

    

    public ResetMissionTimerB() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(reset_mission_timer_b),");
    }
}
