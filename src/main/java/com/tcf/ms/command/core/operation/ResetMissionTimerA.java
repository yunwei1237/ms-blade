package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ResetMissionTimerA implements Operation {

    

    public ResetMissionTimerA() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(reset_mission_timer_a),");
    }
}
