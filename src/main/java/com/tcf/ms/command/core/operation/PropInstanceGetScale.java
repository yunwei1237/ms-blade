package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PropInstanceGetScale implements Operation {

    private Variable positionNo;
    private Variable scenePropId;

    public PropInstanceGetScale(Variable positionNo,Variable scenePropId) {
        this.positionNo = positionNo;
        this.scenePropId = scenePropId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(prop_instance_get_scale,%s,%s),",positionNo,scenePropId);
    }
}
