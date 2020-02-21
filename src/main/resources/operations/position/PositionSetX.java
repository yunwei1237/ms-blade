package com.tcf.ms.command.core.operations.position;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class PositionSetX implements Operation {
    /**
     * 变量
     */
    private Variable positionNo;
    private Variable valueFixedPoint;

    public PositionSetX(Variable positionNo, Variable valueFixedPoint) {
        this.positionNo = positionNo;
        this.valueFixedPoint = valueFixedPoint;
    }

    @Override
    public String toScriptString() {
        return String.format("(position_set_x,%s,%s),",positionNo,valueFixedPoint);
    }
}
