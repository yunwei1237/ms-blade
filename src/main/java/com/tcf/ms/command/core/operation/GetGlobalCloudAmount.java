package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class GetGlobalCloudAmount implements Operation {

    private Variable destination;

    public GetGlobalCloudAmount(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_global_cloud_amount,%s),",destination);
    }
}
