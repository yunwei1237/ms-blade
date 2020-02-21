package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreSub implements Operation {

    private Variable destination;
    private Variable value;
    private Variable value2;

    public StoreSub(Variable destination,Variable value,Variable value2) {
        this.destination = destination;
        this.value = value;
        this.value2 = value2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_sub,%s,%s,%s),",destination,value,value2);
    }
}
