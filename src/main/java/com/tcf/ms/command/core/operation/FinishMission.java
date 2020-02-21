package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class FinishMission implements Operation {

    

    public FinishMission() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(finish_mission),");
    }
}
