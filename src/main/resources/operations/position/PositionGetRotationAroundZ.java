package com.tcf.ms.command.core.operations.position;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class PositionGetRotationAroundZ implements Operation {
    /**
     * 变量
     */
    private Variable destination;
    private Variable positionNo;

    public PositionGetRotationAroundZ(Variable destination, Variable positionNo) {
        this.destination = destination;
        this.positionNo = positionNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(position_get_rotation_around_z,%s,%s),",destination,positionNo);
    }
}
