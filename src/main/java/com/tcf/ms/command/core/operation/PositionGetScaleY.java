package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PositionGetScaleY implements Operation {

    private Variable destinationFixedPoint;
    private Variable positionNo;

    public PositionGetScaleY(Variable destinationFixedPoint,Variable positionNo) {
        this.destinationFixedPoint = destinationFixedPoint;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_get_scale_y,%s,%s),",destinationFixedPoint,positionNo);
    }
}
