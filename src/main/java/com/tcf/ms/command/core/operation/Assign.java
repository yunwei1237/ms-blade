package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class Assign implements Operation {

    private Variable destination;
    private Variable value;

    public Assign(Variable destination,Variable value) {
        this.destination = destination;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(assign,%s,%s),",destination,value);
    }
}
