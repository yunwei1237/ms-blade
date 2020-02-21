package com.tcf.ms.command.core.operations.presentation.create;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CreateMeshOverlay implements Operation {
    /**
     * 模型，图片，组件
     */
    private Variable destination;
    /**
     * 模型id
     */
    private Variable meshId;

    public CreateMeshOverlay(Variable destination, Variable meshId) {
        this.destination = destination;
        this.meshId = meshId;
    }

    @Override
    public String toScriptString() {
        return String.format("(create_mesh_overlay,%s,%s),",destination,meshId);
    }
}
