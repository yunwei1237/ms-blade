package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_enable_talk),  can talk with troops during battles
 */
public class MissionEnableTalk implements Operation{

    

    public MissionEnableTalk() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_enable_talk),");
    }
}
