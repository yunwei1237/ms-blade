package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CurTableauAddMapIcon implements Operation {

    private Variable mapIconId;
    private Variable positionNo;
    private Variable valueFixedPoint;

    public CurTableauAddMapIcon(Variable mapIconId,Variable positionNo,Variable valueFixedPoint) {
        this.mapIconId = mapIconId;
        this.positionNo = positionNo;
        this.valueFixedPoint = valueFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_add_map_icon,%s,%s,%s),",mapIconId,positionNo,valueFixedPoint);
    }
}
