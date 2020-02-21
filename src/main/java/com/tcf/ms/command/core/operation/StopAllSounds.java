package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StopAllSounds implements Operation {

    private Variable options;

    public StopAllSounds(Variable options) {
        this.options = options;     
    }

    @Override
    public String toScriptString() {
        return String.format("(stop_all_sounds,%s),",options);
    }
}
