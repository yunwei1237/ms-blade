package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_animate_to_color, <overlay_id>, <duration-in-1/1000-seconds>, <color>),  alpha value will not be used
 */
public class OverlayAnimateToColor implements Operation{

    private Variable overlayId;
    private Variable duration;
    private Variable color;

    public OverlayAnimateToColor(Variable overlayId,Variable duration,Variable color) {
        this.overlayId = overlayId;
        this.duration = duration;
        this.color = color;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_color,%s,%s,%s),",overlayId,duration,color);
    }
}
