package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (create_image_button_overlay_with_tableau_material, <destination>, <mesh_id>, <tableau_material_id>, <value>),  returns overlay id. value is passed to tableau_material  when mesh_id is -1, a default mesh is generated automatically
 */
public class CreateImageButtonOverlayWithTableauMaterial implements Operation{

    private Variable destination;
    private Variable meshId;
    private Variable tableauMaterialId;
    private Variable value;

    public CreateImageButtonOverlayWithTableauMaterial(Variable destination,Variable meshId,Variable tableauMaterialId,Variable value) {
        this.destination = destination;
        this.meshId = meshId;
        this.tableauMaterialId = tableauMaterialId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_image_button_overlay_with_tableau_material,%s,%s,%s,%s),",destination,meshId,tableauMaterialId,value);
    }
}
