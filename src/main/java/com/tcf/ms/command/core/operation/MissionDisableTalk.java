package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_enable_talk),  disables talk option for the mission
 */
public class MissionDisableTalk implements Operation{

    

    public MissionDisableTalk() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_disable_talk),");
    }
}
