package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class OverlaySetColor implements Operation {

    private Variable overlayId;
    private Variable color;

    public OverlaySetColor(Variable overlayId,Variable color) {
        this.overlayId = overlayId;
        this.color = color;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_color,%s,%s),",overlayId,color);
    }
}
