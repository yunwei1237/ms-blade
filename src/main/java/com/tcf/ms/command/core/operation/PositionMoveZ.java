package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (position_move_z,<position_no>,<movement>,[value]),
 */
public class PositionMoveZ implements Operation{

    private Variable positionNo;
    private Variable movement;
    private Variable value;

    public PositionMoveZ(Variable positionNo,Variable movement,Variable value) {
        this.positionNo = positionNo;
        this.movement = movement;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_move_z,%s,%s,%s),",positionNo,movement,value);
    }
}
