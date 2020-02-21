package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreCurrentScene implements Operation {

    private Variable destination;

    public StoreCurrentScene(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_current_scene,%s),",destination);
    }
}
