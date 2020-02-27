package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (reset_mission_timer_a),
 */
public class ResetMissionTimerA implements Operation{

    

    public ResetMissionTimerA() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(reset_mission_timer_a),");
    }
}
