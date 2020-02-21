package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PositionMoveX implements Operation {

    private Variable positionNo;
    private Variable movement;
    private Variable value;

    public PositionMoveX(Variable positionNo,Variable movement,Variable value) {
        this.positionNo = positionNo;
        this.movement = movement;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_move_x,%s,%s,%s),",positionNo,movement,value);
    }
}
