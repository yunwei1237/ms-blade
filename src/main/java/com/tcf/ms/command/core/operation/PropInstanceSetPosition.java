package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (prop_instance_set_position,<scene_prop_id>,position),
 */
public class PropInstanceSetPosition implements Operation{

    private Variable scenePropId;
    private Variable position;

    public PropInstanceSetPosition(Variable scenePropId,Variable position) {
        this.scenePropId = scenePropId;
        this.position = position;     
    }

    @Override
    public String toScriptString() {
        return String.format("(prop_instance_set_position,%s,%s),",scenePropId,position);
    }
}
