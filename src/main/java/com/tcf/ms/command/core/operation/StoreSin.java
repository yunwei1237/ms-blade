package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_sin, <destination_fixed_point>, <value_fixed_point>), takes sine of the value that is in degrees
 */
public class StoreSin implements Operation{

    private Variable destinationFixedPoint;
    private Variable valueFixedPoint;

    public StoreSin(Variable destinationFixedPoint,Variable valueFixedPoint) {
        this.destinationFixedPoint = destinationFixedPoint;
        this.valueFixedPoint = valueFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_sin,%s,%s),",destinationFixedPoint,valueFixedPoint);
    }
}
