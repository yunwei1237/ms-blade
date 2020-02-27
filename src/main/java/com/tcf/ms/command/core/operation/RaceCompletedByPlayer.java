package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (race_completed_by_player),
 */
public class RaceCompletedByPlayer implements Conditable{

    

    public RaceCompletedByPlayer() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(race_completed_by_player),");
    }
}
