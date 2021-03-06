package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_global_haze_amount, <value>),  value is clamped to 0-100
 */
public class SetGlobalHazeAmount implements Operation{

    private Variable value;

    public SetGlobalHazeAmount(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_global_haze_amount,%s),",value);
    }
}
