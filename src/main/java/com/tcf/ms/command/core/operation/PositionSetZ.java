package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (position_set_z,<position_no>,<value_fixed_point>),  meters / fixed point multiplier is set
 */
public class PositionSetZ implements Operation{

    private Variable positionNo;
    private Variable valueFixedPoint;

    public PositionSetZ(Variable positionNo,Variable valueFixedPoint) {
        this.positionNo = positionNo;
        this.valueFixedPoint = valueFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(position_set_z,%s,%s),",positionNo,valueFixedPoint);
    }
}
