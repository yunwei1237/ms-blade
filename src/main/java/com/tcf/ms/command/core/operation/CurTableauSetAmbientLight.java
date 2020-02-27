package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_tableau_set_ambient_light, <red_fixed_point>, <green_fixed_point>, <blue_fixed_point>),
 */
public class CurTableauSetAmbientLight implements Operation{

    private Variable redFixedPoint;
    private Variable greenFixedPoint;
    private Variable blueFixedPoint;

    public CurTableauSetAmbientLight(Variable redFixedPoint,Variable greenFixedPoint,Variable blueFixedPoint) {
        this.redFixedPoint = redFixedPoint;
        this.greenFixedPoint = greenFixedPoint;
        this.blueFixedPoint = blueFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_set_ambient_light,%s,%s,%s),",redFixedPoint,greenFixedPoint,blueFixedPoint);
    }
}
