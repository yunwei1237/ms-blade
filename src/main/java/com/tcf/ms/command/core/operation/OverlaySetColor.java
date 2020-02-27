package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_set_color, <overlay_id>, <color>),  color in RGB format like 0xRRGGBB (put hexadecimal values for RR GG and BB parts)
 */
public class OverlaySetColor implements Operation{

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
