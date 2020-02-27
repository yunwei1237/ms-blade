package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (reset_mission_timer_c),
 */
public class ResetMissionTimerC implements Operation{

    

    public ResetMissionTimerC() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(reset_mission_timer_c),");
    }
}
