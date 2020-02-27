package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_tableau_add_mesh_with_scale_and_vertex_color, <mesh_id>, <position_no>, <position_no>, <value_fixed_point>, <value>),  second position_no is x,y,z scale factors (with fixed point values). value fixed point is alpha. value is vertex color. use 0 for default values. scale and vertex_color has no default values.
 */
public class CurTableauAddMeshWithScaleAndVertexColor implements Operation{

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
