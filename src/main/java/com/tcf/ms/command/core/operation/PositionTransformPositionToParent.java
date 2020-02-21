package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PositionTransformPositionToParent implements Operation {

    private Variable destPositionNo;
    private Variable positionNo;
    private Variable positionNoToBeTransformed;

    public PositionTransformPositionToParent(Variable destPositionNo,Variable positionNo,Variable positionNoToBeTransformed) {
        this.destPositionNo = destPositionNo;
        this.positionNo = positionNo;
        this.positionNoToBeTransformed = positionNoToBeTransformed;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_transform_position_to_parent,%s,%s,%s),",destPositionNo,positionNo,positionNoToBeTransformed);
    }
}
