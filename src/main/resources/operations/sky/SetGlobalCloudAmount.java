package com.tcf.ms.command.core.operations.sky;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetGlobalCloudAmount implements Operation {
    /**
     * 变量
     */
    private Variable value;

    public SetGlobalCloudAmount(Variable value) {
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(set_global_cloud_amount,%s),",value);
    }
}
