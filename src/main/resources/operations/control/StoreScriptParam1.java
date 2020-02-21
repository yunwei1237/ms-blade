package com.tcf.ms.command.core.operations.control;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreScriptParam1 implements Operation {
    /**
     * 变量,用于保存递增值
     */
    private Variable destination;

    public StoreScriptParam1(Variable destination) {
        this.destination = destination;
    }

    @Override
    public String toScriptString() {
        return String.format("(store_script_param_1,%s),",destination);
    }
}
