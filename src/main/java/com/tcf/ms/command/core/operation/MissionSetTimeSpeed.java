package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_set_time_speed, <value_fixed_point>)  this works only when cheat mode is enabled
 */
public class MissionSetTimeSpeed implements Operation{

    private Variable valueFixedPoint;

    public MissionSetTimeSpeed(Variable valueFixedPoint) {
        this.valueFixedPoint = valueFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_set_time_speed,%s),",valueFixedPoint);
    }
}
