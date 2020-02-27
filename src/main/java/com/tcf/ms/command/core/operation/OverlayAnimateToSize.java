package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_animate_to_size, <overlay_id>, <duration-in-1/1000-seconds>, <position_no>),  position's x and y values are used as
 */
public class OverlayAnimateToSize implements Operation{

    private Variable overlayId;
    private Variable duration;
    private Variable positionNo;

    public OverlayAnimateToSize(Variable overlayId,Variable duration,Variable positionNo) {
        this.overlayId = overlayId;
        this.duration = duration;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_size,%s,%s,%s),",overlayId,duration,positionNo);
    }
}
