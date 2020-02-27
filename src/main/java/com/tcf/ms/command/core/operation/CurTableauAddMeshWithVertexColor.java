package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_tableau_add_mesh_with_vertex_color, <mesh_id>, <position_no>, <value_fixed_point>, <value_fixed_point>, <value>),  first value fixed point is the scale factor, second value fixed point is alpha. value is vertex color. use 0 for default values. vertex_color has no default value.
 */
public class CurTableauAddMeshWithVertexColor implements Operation{

    private Variable meshId;
    private Variable positionNo;
    private Variable valueFixedPoint;
    private Variable valueFixedPoint2;
    private Variable value;

    public CurTableauAddMeshWithVertexColor(Variable meshId,Variable positionNo,Variable valueFixedPoint,Variable valueFixedPoint2,Variable value) {
        this.meshId = meshId;
        this.positionNo = positionNo;
        this.valueFixedPoint = valueFixedPoint;
        this.valueFixedPoint2 = valueFixedPoint2;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_add_mesh_with_vertex_color,%s,%s,%s,%s,%s),",meshId,positionNo,valueFixedPoint,valueFixedPoint2,value);
    }
}
