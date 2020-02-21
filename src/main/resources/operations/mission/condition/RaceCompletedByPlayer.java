package com.tcf.ms.command.core.operations.mission.condition;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class RaceCompletedByPlayer implements Operation, Conditable {
    @Override
    public String toScriptString() {
        return "(race_completed_by_player),";
    }
}
