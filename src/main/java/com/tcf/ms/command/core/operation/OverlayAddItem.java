package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class OverlayAddItem implements Operation {

    private Variable overlayId;
    private Variable stringId;

    public OverlayAddItem(Variable overlayId,Variable stringId) {
        this.overlayId = overlayId;
        this.stringId = stringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_add_item,%s,%s),",overlayId,stringId);
    }
}
