package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_cos, <destination_fixed_point>, <value_fixed_point>), takes cosine of the value that is in degrees
 */
public class StoreCos implements Operation{

    private Variable destinationFixedPoint;
    private Variable valueFixedPoint;

    public StoreCos(Variable destinationFixedPoint,Variable valueFixedPoint) {
        this.destinationFixedPoint = destinationFixedPoint;
        this.valueFixedPoint = valueFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_cos,%s,%s),",destinationFixedPoint,valueFixedPoint);
    }
}
