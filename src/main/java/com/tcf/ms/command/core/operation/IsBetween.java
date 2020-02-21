package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class IsBetween implements Operation ,Conditable{

    private Variable value;
    private Variable lowerBound;
    private Variable upperBound;

    public IsBetween(Variable value,Variable lowerBound,Variable upperBound) {
        this.value = value;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;     
    }

    @Override
    public String toScriptString() {
        return String.format("(is_between,%s,%s,%s),",value,lowerBound,upperBound);
    }
}
