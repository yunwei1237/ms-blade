package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   less or equal to	-- (le,<value>,<value>),
 */
public class Le implements Conditable{

    private Variable value;
    private Variable value2;

    public Le(Variable value,Variable value2) {
        this.value = value;
        this.value2 = value2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(le,%s,%s),",value,value2);
    }
}
