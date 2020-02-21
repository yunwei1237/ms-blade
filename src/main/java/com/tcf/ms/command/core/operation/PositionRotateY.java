package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PositionRotateY implements Operation {

    private Variable positionNo;
    private Variable angle;

    public PositionRotateY(Variable positionNo,Variable angle) {
        this.positionNo = positionNo;
        this.angle = angle;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_rotate_y,%s,%s),",positionNo,angle);
    }
}
