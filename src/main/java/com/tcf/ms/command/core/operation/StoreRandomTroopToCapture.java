package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreRandomTroopToCapture implements Operation {

    private Variable destination;
    private Variable lowerBound;
    private Variable upperBound;

    public StoreRandomTroopToCapture(Variable destination,Variable lowerBound,Variable upperBound) {
        this.destination = destination;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_random_troop_to_capture,%s,%s,%s),",destination,lowerBound,upperBound);
    }
}
