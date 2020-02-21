package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class OverlaySetMeshRotation implements Operation {

    private Variable overlayId;
    private Variable positionNo;

    public OverlaySetMeshRotation(Variable overlayId,Variable positionNo) {
        this.overlayId = overlayId;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_mesh_rotation,%s,%s),",overlayId,positionNo);
    }
}
