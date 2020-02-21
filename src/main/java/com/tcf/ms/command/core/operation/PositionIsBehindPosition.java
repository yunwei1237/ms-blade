package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class PositionIsBehindPosition implements Operation ,Conditable{

    private Variable positionNo1;
    private Variable positionNo2;

    public PositionIsBehindPosition(Variable positionNo1,Variable positionNo2) {
        this.positionNo1 = positionNo1;
        this.positionNo2 = positionNo2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_is_behind_position,%s,%s),",positionNo1,positionNo2);
    }
}
