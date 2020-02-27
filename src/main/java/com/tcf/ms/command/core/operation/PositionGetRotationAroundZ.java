package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (position_get_rotation_around_z,<destination>,<position_no>),  rotation around z axis is returned as angle
 */
public class PositionGetRotationAroundZ implements Operation{

    private Variable destination;
    private Variable positionNo;

    public PositionGetRotationAroundZ(Variable destination,Variable positionNo) {
        this.destination = destination;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_get_rotation_around_z,%s,%s),",destination,positionNo);
    }
}
