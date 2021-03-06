package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   Same as above but starts from (upper-bound - 1) down-to lower bound.  (try_for_range_backwards,<destination>,<upper_bound>,<lower_bound>),
 */
public class TryForRangeBackwards implements Operation{

    private Variable destination;
    private Variable upperBound;
    private Variable lowerBound;

    public TryForRangeBackwards(Variable destination,Variable upperBound,Variable lowerBound) {
        this.destination = destination;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;     
    }

    @Override
    public String toScriptString() {
        return String.format("(try_for_range_backwards,%s,%s,%s),",destination,upperBound,lowerBound);
    }
}
