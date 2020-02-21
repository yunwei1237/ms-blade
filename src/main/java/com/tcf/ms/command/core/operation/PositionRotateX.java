package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PositionRotateX implements Operation {

    private Variable positionNo;
    private Variable angle;

    public PositionRotateX(Variable positionNo,Variable angle) {
        this.positionNo = positionNo;
        this.angle = angle;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_rotate_x,%s,%s),",positionNo,angle);
    }
}
