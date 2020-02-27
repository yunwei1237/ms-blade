package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_set_alpha, <overlay_id>, <alpha>),  alpha in A format like 0xAA (put hexadecimal values for AA part)
 */
public class OverlaySetAlpha implements Operation{

    private Variable overlayId;
    private Variable alpha;

    public OverlaySetAlpha(Variable overlayId,Variable alpha) {
        this.overlayId = overlayId;
        this.alpha = alpha;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_alpha,%s,%s),",overlayId,alpha);
    }
}
