package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetGlobalCloudAmount implements Operation {

    private Variable value;

    public SetGlobalCloudAmount(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_global_cloud_amount,%s),",value);
    }
}
