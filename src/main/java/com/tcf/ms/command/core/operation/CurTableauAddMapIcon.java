package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_tableau_add_map_icon, <map_icon_id>, <position_no>, <value_fixed_point>),  value fixed point is the scale factor
 */
public class CurTableauAddMapIcon implements Operation{

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
