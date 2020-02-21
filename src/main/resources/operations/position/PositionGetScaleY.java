package com.tcf.ms.command.core.operations.position;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class PositionGetScaleY implements Operation {
    /**
     * 变量
     */
    private Variable destinationFixedPoint;
    private Variable positionNo;

    public PositionGetScaleY(Variable destinationFixedPoint, Variable positionNo) {
        this.destinationFixedPoint = destinationFixedPoint;
        this.positionNo = positionNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(position_get_scale_y,%s,%s),",destinationFixedPoint,positionNo);
    }
}
