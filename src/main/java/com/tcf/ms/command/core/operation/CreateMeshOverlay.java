package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CreateMeshOverlay implements Operation {

    private Variable destination;
    private Variable meshId;

    public CreateMeshOverlay(Variable destination,Variable meshId) {
        this.destination = destination;
        this.meshId = meshId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_mesh_overlay,%s,%s),",destination,meshId);
    }
}
