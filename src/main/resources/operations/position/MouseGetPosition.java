package com.tcf.ms.command.core.operations.position;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class MouseGetPosition implements Operation {
    /**
     * 城镇id
     */
    private Variable positionNo;

    public MouseGetPosition(Variable positionNo) {
        this.positionNo = positionNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(mouse_get_position,%s),",positionNo);
    }
}
