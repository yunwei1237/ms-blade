package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class OverlaySetBoundaries implements Operation {
    /**
     * 滑块组件
     */
    private Variable destination;
    /**
     * 最小值
     */
    private Variable minValue;
    /**
     * 最大值
     */
    private Variable maxValue;

    public OverlaySetBoundaries(Variable destination, Variable minValue, Variable maxValue) {
        this.destination = destination;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_boundaries,%s,%s,%s),",destination,minValue,maxValue);
    }
}
