package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (position_get_y,<destination_fixed_point>,<position_no>),  y position in meters * fixed point multiplier is returned
 */
public class PositionGetY implements Operation{

    private Variable destinationFixedPoint;
    private Variable positionNo;

    public PositionGetY(Variable destinationFixedPoint,Variable positionNo) {
        this.destinationFixedPoint = destinationFixedPoint;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_get_y,%s,%s),",destinationFixedPoint,positionNo);
    }
}
