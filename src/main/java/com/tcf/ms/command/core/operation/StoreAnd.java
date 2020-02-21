package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * (store_or,<destination>,<value>,<value>),
 */
public class StoreAnd implements Operation {

    private Variable destination;
    private Variable value1;
    private Variable value2;

    public StoreAnd(Variable destination, Variable value1, Variable value2) {
        this.destination = destination;
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toScriptString() {
        return String.format("(store_and,%s,%s,%s),",this.destination,this.value1,this.value2);
    }
}
