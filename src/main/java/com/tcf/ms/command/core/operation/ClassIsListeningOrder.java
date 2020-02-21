package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class ClassIsListeningOrder implements Operation ,Conditable{

    private Variable teamNo;
    private Variable subClass;

    public ClassIsListeningOrder(Variable teamNo,Variable subClass) {
        this.teamNo = teamNo;
        this.subClass = subClass;     
    }

    @Override
    public String toScriptString() {
        return String.format("(class_is_listening_order,%s,%s),",teamNo,subClass);
    }
}
