package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_set_size, <overlay_id>, <position_no>),  position's x and y values are used
 */
public class OverlaySetSize implements Operation{

    private Variable overlayId;
    private Variable positionNo;

    public OverlaySetSize(Variable overlayId,Variable positionNo) {
        this.overlayId = overlayId;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_size,%s,%s),",overlayId,positionNo);
    }
}
