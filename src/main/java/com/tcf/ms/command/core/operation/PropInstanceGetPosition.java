package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PropInstanceGetPosition implements Operation {

    private Variable positionNo;
    private Variable scenePropId;

    public PropInstanceGetPosition(Variable positionNo,Variable scenePropId) {
        this.positionNo = positionNo;
        this.scenePropId = scenePropId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(prop_instance_get_position,%s,%s),",positionNo,scenePropId);
    }
}
