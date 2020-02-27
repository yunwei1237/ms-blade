package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_animate_to_alpha, <overlay_id>, <duration-in-1/1000-seconds>, <color>),  only alpha value will be used
 */
public class OverlayAnimateToAlpha implements Operation{

    private Variable overlayId;
    private Variable duration;
    private Variable color;

    public OverlayAnimateToAlpha(Variable overlayId,Variable duration,Variable color) {
        this.overlayId = overlayId;
        this.duration = duration;
        this.color = color;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_alpha,%s,%s,%s),",overlayId,duration,color);
    }
}
