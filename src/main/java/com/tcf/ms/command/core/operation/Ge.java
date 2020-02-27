package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   greater than or equal to -- (ge,<value>,<value>),
 */
public class Ge implements Conditable{

    private Variable value;
    private Variable value2;

    public Ge(Variable value,Variable value2) {
        this.value = value;
        this.value2 = value2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(ge,%s,%s),",value,value2);
    }
}
