package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *  dest, operand ::       dest = min(dest, operand)  (val_min,<destination>,<value>),
 */
public class ValMin implements Operation{

    private Variable destination;
    private Variable value;

    public ValMin(Variable destination,Variable value) {
        this.destination = destination;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(val_min,%s,%s),",destination,value);
    }
}
