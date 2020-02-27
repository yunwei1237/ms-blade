package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   Works like a for loop from lower-bound up to (upper-bound - 1)  (try_for_range,<destination>,<lower_bound>,<upper_bound>),
 */
public class TryForRange implements Operation{

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
