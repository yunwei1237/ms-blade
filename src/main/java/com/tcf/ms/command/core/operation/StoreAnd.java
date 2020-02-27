package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *  dest, op1, op2 :      dest = op1 & op2  (store_or,<destination>,<value>,<value>),
 */
public class StoreAnd implements Operation{

    private Variable destination;
    private Variable value;
    private Variable value2;

    public StoreAnd(Variable destination,Variable value,Variable value2) {
        this.destination = destination;
        this.value = value;
        this.value2 = value2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_and,%s,%s,%s),",destination,value,value2);
    }
}
