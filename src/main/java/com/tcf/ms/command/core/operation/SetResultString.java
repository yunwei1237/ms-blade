package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   sets the result string for game scripts that need one (set_result_string, <string_id>),
 */
public class SetResultString implements Operation{

    private Variable stringId;

    public SetResultString(Variable stringId) {
        this.stringId = stringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_result_string,%s),",stringId);
    }
}
