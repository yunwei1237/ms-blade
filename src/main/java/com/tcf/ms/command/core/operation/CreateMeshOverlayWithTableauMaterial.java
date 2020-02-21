package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CreateMeshOverlayWithTableauMaterial implements Operation {

    private Variable destination;
    private Variable meshId;
    private Variable tableauMaterialId;
    private Variable value;

    public CreateMeshOverlayWithTableauMaterial(Variable destination,Variable meshId,Variable tableauMaterialId,Variable value) {
        this.destination = destination;
        this.meshId = meshId;
        this.tableauMaterialId = tableauMaterialId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_mesh_overlay_with_tableau_material,%s,%s,%s,%s),",destination,meshId,tableauMaterialId,value);
    }
}
