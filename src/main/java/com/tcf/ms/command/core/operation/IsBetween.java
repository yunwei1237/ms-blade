package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (is_between,<value>,<lower_bound>,<upper_bound>),  greater than or equal to lower bound and less than upper bound
 */
public class IsBetween implements Conditable{

    private Variable value;
    private Variable lowerBound;
    private Variable upperBound;

    public IsBetween(Variable value,Variable lowerBound,Variable upperBound) {
        this.value = value;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;     
    }

    @Override
    public String toScriptString() {
        return String.format("(is_between,%s,%s,%s),",value,lowerBound,upperBound);
    }
}
