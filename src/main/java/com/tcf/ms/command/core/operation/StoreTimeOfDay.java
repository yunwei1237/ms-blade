package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_time_of_day,<destination>),
 */
public class StoreTimeOfDay implements Operation{

    private Variable destination;

    public StoreTimeOfDay(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_time_of_day,%s),",destination);
    }
}
