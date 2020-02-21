package com.tcf.ms.command.core.operations.control;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TryForParties implements Operation {
    /**
     * 变量,用于保存递增值
     */
    private Variable destination;

    public TryForParties(Variable destination) {
        this.destination = destination;
    }

    @Override
    public String toScriptString() {
        return String.format("(try_for_parties,%s),",destination);
    }
}
