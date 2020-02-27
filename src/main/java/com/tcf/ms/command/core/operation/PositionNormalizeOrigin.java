package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (position_normalize_origin,<destination_fixed_point>,<position_no>),  destination = convert_to_fixed_point(length(position.origin))  position.origin *= 1/length(position.origin)  so it normalizes the origin vector
 */
public class PositionNormalizeOrigin implements Operation{

    private Variable destinationFixedPoint;
    private Variable positionNo;

    public PositionNormalizeOrigin(Variable destinationFixedPoint,Variable positionNo) {
        this.destinationFixedPoint = destinationFixedPoint;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_normalize_origin,%s,%s),",destinationFixedPoint,positionNo);
    }
}
