package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CurTableauAddMeshWithScaleAndVertexColor implements Operation {

    private Variable meshId;
    private Variable positionNo;
    private Variable positionNo2;
    private Variable valueFixedPoint;
    private Variable value;

    public CurTableauAddMeshWithScaleAndVertexColor(Variable meshId,Variable positionNo,Variable positionNo2,Variable valueFixedPoint,Variable value) {
        this.meshId = meshId;
        this.positionNo = positionNo;
        this.positionNo2 = positionNo2;
        this.valueFixedPoint = valueFixedPoint;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_add_mesh_with_scale_and_vertex_color,%s,%s,%s,%s,%s),",meshId,positionNo,positionNo2,valueFixedPoint,value);
    }
}
