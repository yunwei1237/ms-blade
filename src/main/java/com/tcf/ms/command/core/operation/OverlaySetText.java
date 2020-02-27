package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_set_text, <overlay_id>, <string_id>),
 */
public class OverlaySetText implements Operation{

    private Variable overlayId;
    private Variable stringId;

    public OverlaySetText(Variable overlayId,Variable stringId) {
        this.overlayId = overlayId;
        this.stringId = stringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_text,%s,%s),",overlayId,stringId);
    }
}
