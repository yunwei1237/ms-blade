package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class Gt implements Operation ,Conditable{

    private Variable value;
    private Variable value2;

    public Gt(Variable value,Variable value2) {
        this.value = value;
        this.value2 = value2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(gt,%s,%s),",value,value2);
    }
}
