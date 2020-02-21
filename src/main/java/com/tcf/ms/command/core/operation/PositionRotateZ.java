package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PositionRotateZ implements Operation {

    private Variable positionNo;
    private Variable angle;

    public PositionRotateZ(Variable positionNo,Variable angle) {
        this.positionNo = positionNo;
        this.angle = angle;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_rotate_z,%s,%s),",positionNo,angle);
    }
}
