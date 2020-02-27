package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (overlay_set_mesh_rotation, <overlay_id>, <position_no>),  position's rotation values are used for rotations around x, y and z axis
 */
public class OverlaySetMeshRotation implements Operation{

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
