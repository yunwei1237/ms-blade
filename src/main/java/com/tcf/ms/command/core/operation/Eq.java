package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   equal to		      -- (eq,<value>,<value>),
 */
public class Eq implements Conditable{

    private Variable value;
    private Variable value2;

    public Eq(Variable value,Variable value2) {
        this.value = value;
        this.value2 = value2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(eq,%s,%s),",value,value2);
    }
}
