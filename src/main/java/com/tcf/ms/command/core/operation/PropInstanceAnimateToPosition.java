package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (prop_instance_animate_to_position,<scene_prop_id>,position,<duration-in-1/100-seconds>),
 */
public class PropInstanceAnimateToPosition implements Operation{

    private Variable scenePropId;
    private Variable position;
    private Variable duration;

    public PropInstanceAnimateToPosition(Variable scenePropId,Variable position,Variable duration) {
        this.scenePropId = scenePropId;
        this.position = position;
        this.duration = duration;     
    }

    @Override
    public String toScriptString() {
        return String.format("(prop_instance_animate_to_position,%s,%s,%s),",scenePropId,position,duration);
    }
}
