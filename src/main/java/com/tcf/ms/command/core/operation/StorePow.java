package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * (store_pow, <destination_fixed_point>, <value_fixed_point>, <value_fixed_point),
 */
public class StorePow implements Operation {

    private Variable destinationFixedPoint;
    private Variable valueFixedPoint1;
    private Variable valueFixedPoint2;

    public StorePow(Variable destinationFixedPoint, Variable valueFixedPoint1, Variable valueFixedPoint2) {
        this.destinationFixedPoint = destinationFixedPoint;
        this.valueFixedPoint1 = valueFixedPoint1;
        this.valueFixedPoint2 = valueFixedPoint2;
    }

    @Override
    public String toScriptString() {
        return String.format("(store_pow,%s,%s,%s),",destinationFixedPoint,valueFixedPoint1,valueFixedPoint2);
    }
}
