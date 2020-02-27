package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_get_time_speed, <destination_fixed_point>),
 */
public class MissionGetTimeSpeed implements Operation{

    private Variable destinationFixedPoint;

    public MissionGetTimeSpeed(Variable destinationFixedPoint) {
        this.destinationFixedPoint = destinationFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_get_time_speed,%s),",destinationFixedPoint);
    }
}
