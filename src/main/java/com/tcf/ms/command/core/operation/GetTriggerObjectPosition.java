package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (get_trigger_object_position,<position_no>),
 */
public class GetTriggerObjectPosition implements Operation{

    private Variable positionNo;

    public GetTriggerObjectPosition(Variable positionNo) {
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_trigger_object_position,%s),",positionNo);
    }
}
