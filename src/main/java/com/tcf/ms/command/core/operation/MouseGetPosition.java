package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mouse_get_position, <position_no>),  x and y values of position are filled
 */
public class MouseGetPosition implements Operation{

    private Variable positionNo;

    public MouseGetPosition(Variable positionNo) {
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mouse_get_position,%s),",positionNo);
    }
}
