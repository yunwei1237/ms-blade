package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_pow, <destination_fixed_point>, <value_fixed_point>, <value_fixed_point), takes square root of the value dest, op1, op2 :      dest = op1 ^ op2
 */
public class StorePow implements Operation{

    private Variable destinationFixedPoint;
    private Variable valueFixedPoint;
    private Variable valueFixedPoin;

    public StorePow(Variable destinationFixedPoint,Variable valueFixedPoint,Variable valueFixedPoin) {
        this.destinationFixedPoint = destinationFixedPoint;
        this.valueFixedPoint = valueFixedPoint;
        this.valueFixedPoin = valueFixedPoin;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_pow,%s,%s,%s),",destinationFixedPoint,valueFixedPoint,valueFixedPoin);
    }
}
