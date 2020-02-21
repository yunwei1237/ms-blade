package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CurTableauAddMesh implements Operation {

    private Variable meshId;
    private Variable positionNo;
    private Variable valueFixedPoint;
    private Variable valueFixedPoint2;

    public CurTableauAddMesh(Variable meshId,Variable positionNo,Variable valueFixedPoint,Variable valueFixedPoint2) {
        this.meshId = meshId;
        this.positionNo = positionNo;
        this.valueFixedPoint = valueFixedPoint;
        this.valueFixedPoint2 = valueFixedPoint2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_add_mesh,%s,%s,%s,%s),",meshId,positionNo,valueFixedPoint,valueFixedPoint2);
    }
}
