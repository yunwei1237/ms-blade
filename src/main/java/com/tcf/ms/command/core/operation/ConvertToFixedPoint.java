package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (convert_to_fixed_point, <destination_fixed_point>), multiplies the value with the fixed point multiplier
 */
public class ConvertToFixedPoint implements Operation{

    private Variable destinationFixedPoint;

    public ConvertToFixedPoint(Variable destinationFixedPoint) {
        this.destinationFixedPoint = destinationFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(convert_to_fixed_point,%s),",destinationFixedPoint);
    }
}
