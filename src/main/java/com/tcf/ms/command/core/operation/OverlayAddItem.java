package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_add_item, <overlay_id>, <string_id>),   adds an item to the combo box
 */
public class OverlayAddItem implements Operation{

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
