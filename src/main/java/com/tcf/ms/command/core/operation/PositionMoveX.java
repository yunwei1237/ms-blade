package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   movement is in cms, [0 = local; 1=global]  (position_move_x,<position_no>,<movement>,[value]),
 */
public class PositionMoveX implements Operation{

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
