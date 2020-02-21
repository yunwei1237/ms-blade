package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class RaceCompletedByPlayer implements Operation ,Conditable{

    

    public RaceCompletedByPlayer() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(race_completed_by_player),");
    }
}
