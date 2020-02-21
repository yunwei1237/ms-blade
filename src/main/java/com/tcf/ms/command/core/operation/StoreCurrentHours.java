package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreCurrentHours implements Operation {

    private Variable destination;

    public StoreCurrentHours(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_current_hours,%s),",destination);
    }
}
