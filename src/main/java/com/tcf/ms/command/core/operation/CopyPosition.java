package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   copies position_no_2 to position_no_1  (copy_position,<position_no_1>,<position_no_2>),
 */
public class CopyPosition implements Operation{

    private Variable positionNo1;
    private Variable positionNo2;

    public CopyPosition(Variable positionNo1,Variable positionNo2) {
        this.positionNo1 = positionNo1;
        this.positionNo2 = positionNo2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(copy_position,%s,%s),",positionNo1,positionNo2);
    }
}
