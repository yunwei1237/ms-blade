package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class OverlaySetHilightAlpha implements Operation {
    /**
     * 组件id
     */
    private Variable overlayId;
    /**
     * 透明度值
     * alpha in A format like 0xAA
     */
    private Variable alpha;

    public OverlaySetHilightAlpha(Variable overlayId, Variable alpha) {
        this.overlayId = overlayId;
        this.alpha = alpha;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_hilight_alpha,%s,%s),",overlayId,alpha);
    }
}
