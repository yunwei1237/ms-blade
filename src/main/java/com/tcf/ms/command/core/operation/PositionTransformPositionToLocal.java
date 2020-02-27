package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (position_transform_position_to_local, <dest_position_no>,<position_no>,<position_no_to_be_transformed>),
 */
public class PositionTransformPositionToLocal implements Operation{

    private Variable destPositionNo;
    private Variable positionNo;
    private Variable positionNoToBeTransformed;

    public PositionTransformPositionToLocal(Variable destPositionNo,Variable positionNo,Variable positionNoToBeTransformed) {
        this.destPositionNo = destPositionNo;
        this.positionNo = positionNo;
        this.positionNoToBeTransformed = positionNoToBeTransformed;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_transform_position_to_local,%s,%s,%s),",destPositionNo,positionNo,positionNoToBeTransformed);
    }
}
