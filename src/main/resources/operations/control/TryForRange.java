package com.tcf.ms.command.core.operations.control;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TryForRange implements Operation {
    /**
     * 变量,用于保存递增值
     */
    private Variable destination;
    /**
     * 开始值(包含)
     */
    private Variable lower_bound;
    /**
     * 结束值(不包含)
     */
    private Variable upper_bound;

    public TryForRange(Variable destination, Variable lower_bound, Variable upper_bound) {
        this.destination = destination;
        this.lower_bound = lower_bound;
        this.upper_bound = upper_bound;
    }

    @Override
    public String toScriptString() {
        return String.format("(try_for_range,%s,%s,%s),",destination,lower_bound,upper_bound);
    }
}
