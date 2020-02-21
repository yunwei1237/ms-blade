package com.tcf.ms.command.core.operations.presentation.create;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CreateMeshOverlayWithTableauMaterial implements Operation {
    /**
     * 模型，图片，组件
     */
    private Variable destination;
    /**
     * 模型id
     */
    private Variable meshId;
    /**
     * 图片id
     */
    private Variable tableauMaterialId;

    /**
     * 传递到图片的值
     */
    private Variable value;

    public CreateMeshOverlayWithTableauMaterial(Variable destination, Variable meshId, Variable tableauMaterialId, Variable value) {
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
