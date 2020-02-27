package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_tableau_add_point_light, <map_icon_id>, <position_no>, <red_fixed_point>, <green_fixed_point>, <blue_fixed_point>),
 */
public class CurTableauAddPointLight implements Operation{

    private Variable mapIconId;
    private Variable positionNo;
    private Variable redFixedPoint;
    private Variable greenFixedPoint;
    private Variable blueFixedPoint;

    public CurTableauAddPointLight(Variable mapIconId,Variable positionNo,Variable redFixedPoint,Variable greenFixedPoint,Variable blueFixedPoint) {
        this.mapIconId = mapIconId;
        this.positionNo = positionNo;
        this.redFixedPoint = redFixedPoint;
        this.greenFixedPoint = greenFixedPoint;
        this.blueFixedPoint = blueFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_add_point_light,%s,%s,%s,%s,%s),",mapIconId,positionNo,redFixedPoint,greenFixedPoint,blueFixedPoint);
    }
}
