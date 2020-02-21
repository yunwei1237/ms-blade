package com.tcf.ms.command.core.operations.position;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class PositionSetY implements Operation {
    /**
     * 变量
     */
    private Variable positionNo;
    private Variable valueFixedPoint;

    public PositionSetY(Variable positionNo, Variable valueFixedPoint) {
        this.positionNo = positionNo;
        this.valueFixedPoint = valueFixedPoint;
    }

    @Override
    public String toScriptString() {
        return String.format("(position_set_y,%s,%s),",positionNo,valueFixedPoint);
    }
}
