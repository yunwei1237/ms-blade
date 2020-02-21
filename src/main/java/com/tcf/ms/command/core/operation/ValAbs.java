package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class ValAbs implements Operation {

    private Variable destination;

    public ValAbs(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(val_abs,%s),",destination);
    }
}
