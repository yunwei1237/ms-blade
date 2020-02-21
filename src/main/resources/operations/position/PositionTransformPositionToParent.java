package com.tcf.ms.command.core.operations.position;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class PositionTransformPositionToParent implements Operation {
    /**
     * 目标坐标
     */
    private Variable destPositionNo;
    /**
     * 基础坐标
     */
    private Variable positionNo;
    /**
     * 被操作后的坐标
     */
    private Variable positionNoToBeTransformed;

    public PositionTransformPositionToParent(Variable destPositionNo, Variable positionNo, Variable positionNoToBeTransformed) {
        this.destPositionNo = destPositionNo;
        this.positionNo = positionNo;
        this.positionNoToBeTransformed = positionNoToBeTransformed;
    }

    @Override
    public String toScriptString() {
        return String.format("(position_transform_position_to_parent,%s,%s,%s),",destPositionNo,positionNo,positionNoToBeTransformed);
    }
}
