package com.tcf.ms.command.core.operations.position;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

import java.util.Objects;

public class PositionMoveX implements Operation {
    /**
     * 坐标
     */
    private Variable positionNo;
    /**
     * 相对位置
     * 0 = local; 1=global
     */
    private Variable movement;
    /**
     * 移动值
     */
    private Variable value;

    public PositionMoveX(Variable positionNo, Variable movement) {
        this(positionNo,movement,null);
    }

    public PositionMoveX(Variable positionNo, Variable movement, Variable value) {
        this.positionNo = positionNo;
        this.movement = movement;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return Objects.isNull(value) ? String.format("(position_move_x,%s,%s),",positionNo,movement) : String.format("(position_move_x,%s,%s,%s),",positionNo,movement,value);
    }
}
