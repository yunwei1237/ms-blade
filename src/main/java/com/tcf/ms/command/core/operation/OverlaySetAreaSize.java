package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_set_area_size, <overlay_id>, <position_no>),  position's x and y values are used
 */
public class OverlaySetAreaSize implements Operation{

    private Variable overlayId;
    private Variable positionNo;

    public OverlaySetAreaSize(Variable overlayId,Variable positionNo) {
        this.overlayId = overlayId;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_area_size,%s,%s),",overlayId,positionNo);
    }
}
