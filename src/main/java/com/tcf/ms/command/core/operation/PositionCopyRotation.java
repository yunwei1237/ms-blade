package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (position_copy_rotation,<position_no_1>,<position_no_2>), copies rotation of position_no_2 to position_no_1
 */
public class PositionCopyRotation implements Operation{

    private Variable positionNo1;
    private Variable positionNo2;

    public PositionCopyRotation(Variable positionNo1,Variable positionNo2) {
        this.positionNo1 = positionNo1;
        this.positionNo2 = positionNo2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_copy_rotation,%s,%s),",positionNo1,positionNo2);
    }
}
