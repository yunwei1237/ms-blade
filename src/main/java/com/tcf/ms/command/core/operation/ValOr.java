package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *  dest, operand ::       dest = dest | operand  (val_or,<destination>,<value>),
 */
public class ValOr implements Operation{

    private Variable destination;
    private Variable value;

    public ValOr(Variable destination,Variable value) {
        this.destination = destination;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(val_or,%s,%s),",destination,value);
    }
}
