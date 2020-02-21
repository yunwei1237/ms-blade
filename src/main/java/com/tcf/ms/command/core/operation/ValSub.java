package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class ValSub implements Operation {

    private Variable destination;
    private Variable value;

    public ValSub(Variable destination,Variable value) {
        this.destination = destination;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(val_sub,%s,%s),",destination,value);
    }
}
