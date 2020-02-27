package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (convert_from_fixed_point, <destination>), divides the value with the fixed point multiplier
 */
public class ConvertFromFixedPoint implements Operation{

    private Variable destination;

    public ConvertFromFixedPoint(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(convert_from_fixed_point,%s),",destination);
    }
}
