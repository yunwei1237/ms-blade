package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreCos implements Operation {

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