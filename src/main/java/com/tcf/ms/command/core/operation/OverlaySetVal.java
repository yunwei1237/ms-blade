package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_set_val, <overlay_id>, <value>),  can be used for sliders, combo buttons and check boxes
 */
public class OverlaySetVal implements Operation{

    private Variable overlayId;
    private Variable value;

    public OverlaySetVal(Variable overlayId,Variable value) {
        this.overlayId = overlayId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_val,%s,%s),",overlayId,value);
    }
}
