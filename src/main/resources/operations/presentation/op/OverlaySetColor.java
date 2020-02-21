package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class OverlaySetColor implements Operation {
    /**
     * 组件id
     */
    private Variable overlayId;
    /**
     * 颜色值
     * color in RGB format like 0xRRGGBB
     */
    private Variable color;

    public OverlaySetColor(Variable overlayId, Variable color) {
        this.overlayId = overlayId;
        this.color = color;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_color,%s,%s),",overlayId,color);
    }
}
