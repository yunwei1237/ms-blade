package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreRandomInRange implements Operation {

    private Variable destination;
    private Variable rangeLow;
    private Variable rangeHigh;

    public StoreRandomInRange(Variable destination,Variable rangeLow,Variable rangeHigh) {
        this.destination = destination;
        this.rangeLow = rangeLow;
        this.rangeHigh = rangeHigh;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_random_in_range,%s,%s,%s),",destination,rangeLow,rangeHigh);
    }
}
