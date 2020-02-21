package com.tcf.ms.command.core.operations.position;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class GetTriggerObjectPosition implements Operation {
    /**
     * 变量
     */
    private Variable positionNo;

    public GetTriggerObjectPosition(Variable positionNo) {
        this.positionNo = positionNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(get_trigger_object_position,%s),",positionNo);
    }
}
