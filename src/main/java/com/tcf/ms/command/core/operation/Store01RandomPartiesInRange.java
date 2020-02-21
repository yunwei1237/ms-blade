package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class Store01RandomPartiesInRange implements Operation {

    private Variable lowerBound;
    private Variable upperBound;

    public Store01RandomPartiesInRange(Variable lowerBound,Variable upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store01_random_parties_in_range,%s,%s),",lowerBound,upperBound);
    }
}
