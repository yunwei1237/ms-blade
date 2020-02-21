package com.tcf.ms.command.core.operations.condition;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetResultString implements Operation {
    /**
     * 城镇id
     */
    private Variable stringId;

    public SetResultString(Variable stringId) {
        this.stringId = stringId;
    }

    @Override
    public String toScriptString() {
        return String.format("(set_result_string,%s),",stringId);
    }
}
