package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SimulateBattle implements Operation {

    private Variable value;

    public SimulateBattle(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(simulate_battle,%s),",value);
    }
}
