package com.tcf.ms.command.core.operations.control;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TryForAgnts implements Operation {
    /**
     * 变量,用于保存递增值
     */
    private Variable destination;

    public TryForAgnts(Variable destination) {
        this.destination = destination;
    }

    @Override
    public String toScriptString() {
        return String.format("(try_for_agents,%s),",destination);
    }
}
