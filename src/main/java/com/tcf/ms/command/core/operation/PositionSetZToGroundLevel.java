package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PositionSetZToGroundLevel implements Operation {

    private Variable positionNo;

    public PositionSetZToGroundLevel(Variable positionNo) {
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_set_z_to_ground_level,%s),",positionNo);
    }
}
