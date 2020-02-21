package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class OverlaySetAlpha implements Operation {
    /**
     * 组件id
     */
    private Variable overlayId;
    /**
     * 透明度值
     * alpha in A format like 0xAA
     */
    private Variable alpha;

    public OverlaySetAlpha(Variable overlayId, Variable alpha) {
        this.overlayId = overlayId;
        this.alpha = alpha;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_alpha,%s,%s),",overlayId,alpha);
    }
}
