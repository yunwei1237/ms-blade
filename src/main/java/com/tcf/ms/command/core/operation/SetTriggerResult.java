package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetTriggerResult implements Operation {

    private Variable value;

    public SetTriggerResult(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_trigger_result,%s),",value);
    }
}
