package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   not equal to		-- (neq,<value>,<value>),
 */
public class Neq implements Conditable{

    private Variable value;
    private Variable value2;

    public Neq(Variable value,Variable value2) {
        this.value = value;
        this.value2 = value2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(neq,%s,%s),",value,value2);
    }
}
