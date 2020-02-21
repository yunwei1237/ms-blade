package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PositionGetScaleZ implements Operation {

    private Variable destinationFixedPoint;
    private Variable positionNo;

    public PositionGetScaleZ(Variable destinationFixedPoint,Variable positionNo) {
        this.destinationFixedPoint = destinationFixedPoint;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_get_scale_z,%s,%s),",destinationFixedPoint,positionNo);
    }
}
