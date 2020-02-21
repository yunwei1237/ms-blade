package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetBackgroundMesh implements Operation {

    private Variable meshId;

    public SetBackgroundMesh(Variable meshId) {
        this.meshId = meshId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_background_mesh,%s),",meshId);
    }
}
