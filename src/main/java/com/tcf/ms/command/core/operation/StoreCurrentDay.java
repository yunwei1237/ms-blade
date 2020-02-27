package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_current_day,<destination>),
 */
public class StoreCurrentDay implements Operation{

    private Variable destination;

    public StoreCurrentDay(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_current_day,%s),",destination);
    }
}
