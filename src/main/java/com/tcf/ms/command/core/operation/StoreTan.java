package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreTan implements Operation {

    private Variable destinationFixedPoint;
    private Variable valueFixedPoint;

    public StoreTan(Variable destinationFixedPoint,Variable valueFixedPoint) {
        this.destinationFixedPoint = destinationFixedPoint;
        this.valueFixedPoint = valueFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_tan,%s,%s),",destinationFixedPoint,valueFixedPoint);
    }
}
