package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TryForRange implements Operation {

    private Variable destination;
    private Variable lowerBound;
    private Variable upperBound;

    public TryForRange(Variable destination,Variable lowerBound,Variable upperBound) {
        this.destination = destination;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;     
    }

    @Override
    public String toScriptString() {
        return String.format("(try_for_range,%s,%s,%s),",destination,lowerBound,upperBound);
    }
}