package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionTimeSpeedMoveToValue implements Operation {

    

    public MissionTimeSpeedMoveToValue() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_time_speed_move_to_value),");
    }
}
