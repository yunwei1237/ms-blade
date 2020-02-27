package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_set_boundaries, <overlay_id>, <min_value>, <max_value>),
 */
public class OverlaySetBoundaries implements Operation{

    private Variable overlayId;
    private Variable minValue;
    private Variable maxValue;

    public OverlaySetBoundaries(Variable overlayId,Variable minValue,Variable maxValue) {
        this.overlayId = overlayId;
        this.minValue = minValue;
        this.maxValue = maxValue;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_boundaries,%s,%s,%s),",overlayId,minValue,maxValue);
    }
}
