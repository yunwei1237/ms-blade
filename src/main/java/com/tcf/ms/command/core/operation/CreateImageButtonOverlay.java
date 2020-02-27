package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (create_image_button_overlay, <destination>, <mesh_id>, <mesh_id>),  returns overlay id. second mesh is the pressed button mesh
 */
public class CreateImageButtonOverlay implements Operation{

    private Variable destination;
    private Variable meshId;
    private Variable meshId2;

    public CreateImageButtonOverlay(Variable destination,Variable meshId,Variable meshId2) {
        this.destination = destination;
        this.meshId = meshId;
        this.meshId2 = meshId2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_image_button_overlay,%s,%s,%s),",destination,meshId,meshId2);
    }
}
