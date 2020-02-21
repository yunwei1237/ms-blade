package com.tcf.ms.command.core.operations.sky;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class GetGlobalCloudAmount implements Operation {
    /**
     * 变量
     */
    private Variable destination;

    public GetGlobalCloudAmount(Variable destination) {
        this.destination = destination;
    }

    @Override
    public String toScriptString() {
        return String.format("(get_global_cloud_amount,%s),",destination);
    }
}
