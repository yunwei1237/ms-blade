package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreScriptParam2 implements Operation {

    private Variable destination;

    public StoreScriptParam2(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_script_param_2,%s),",destination);
    }
}
