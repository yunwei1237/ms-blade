package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (prop_instance_get_starting_position,<position_no>,<scene_prop_id>),
 */
public class PropInstanceGetStartingPosition implements Operation{

    private Variable positionNo;
    private Variable scenePropId;

    public PropInstanceGetStartingPosition(Variable positionNo,Variable scenePropId) {
        this.positionNo = positionNo;
        this.scenePropId = scenePropId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(prop_instance_get_starting_position,%s,%s),",positionNo,scenePropId);
    }
}
