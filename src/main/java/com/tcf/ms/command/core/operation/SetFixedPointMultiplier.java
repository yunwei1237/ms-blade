package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetFixedPointMultiplier implements Operation {

    private Variable value;

    public SetFixedPointMultiplier(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_fixed_point_multiplier,%s),",value);
    }
}
