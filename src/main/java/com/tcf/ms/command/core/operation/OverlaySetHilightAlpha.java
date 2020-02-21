package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class OverlaySetHilightAlpha implements Operation {

    private Variable overlayId;
    private Variable alpha;

    public OverlaySetHilightAlpha(Variable overlayId,Variable alpha) {
        this.overlayId = overlayId;
        this.alpha = alpha;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_hilight_alpha,%s,%s),",overlayId,alpha);
    }
}
