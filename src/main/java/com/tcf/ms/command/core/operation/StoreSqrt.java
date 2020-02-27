package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_sqrt, <destination_fixed_point>, <value_fixed_point>), takes square root of the value
 */
public class StoreSqrt implements Operation{

    private Variable destinationFixedPoint;
    private Variable valueFixedPoint;

    public StoreSqrt(Variable destinationFixedPoint,Variable valueFixedPoint) {
        this.destinationFixedPoint = destinationFixedPoint;
        this.valueFixedPoint = valueFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_sqrt,%s,%s),",destinationFixedPoint,valueFixedPoint);
    }
}
