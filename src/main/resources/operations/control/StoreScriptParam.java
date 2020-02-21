package com.tcf.ms.command.core.operations.control;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreScriptParam implements Operation {
    /**
     * 变量,用于保存递增值
     */
    private Variable destination;
    /**
     * 参数名称
     */
    private Variable scriptParamNo;

    public StoreScriptParam(Variable destination) {
        this.destination = destination;
    }

    @Override
    public String toScriptString() {
        return String.format("(store_script_param,%s,%s),",destination,scriptParamNo);
    }
}
