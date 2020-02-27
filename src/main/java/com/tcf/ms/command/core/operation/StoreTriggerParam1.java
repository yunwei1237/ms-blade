package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_trigger_param_1,<destination>),
 */
public class StoreTriggerParam1 implements Operation{

    private Variable destination;

    public StoreTriggerParam1(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_trigger_param_1,%s),",destination);
    }
}
