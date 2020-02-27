package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (finish_mission),
 */
public class FinishMission implements Operation{

    

    public FinishMission() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(finish_mission),");
    }
}
