package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_speed_move_to_value, <value_fixed_point>, <duration-in-1/1000-seconds>)  this works only when cheat mode is enabled
 */
public class MissionTimeSpeedMoveToValue implements Operation{

    private Variable valueFixedPoint;
    private Variable duration;

    public MissionTimeSpeedMoveToValue(Variable valueFixedPoint,Variable duration) {
        this.valueFixedPoint = valueFixedPoint;
        this.duration = duration;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_time_speed_move_to_value,%s,%s),",valueFixedPoint,duration);
    }
}
