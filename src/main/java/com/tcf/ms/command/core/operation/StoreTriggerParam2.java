package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreTriggerParam2 implements Operation {

    private Variable destination;

    public StoreTriggerParam2(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_trigger_param_2,%s),",destination);
    }
}
