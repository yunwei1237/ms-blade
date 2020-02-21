package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetCurrentColor implements Operation {

    private Variable value;
    private Variable value2;
    private Variable value3;

    public SetCurrentColor(Variable value,Variable value2,Variable value3) {
        this.value = value;
        this.value2 = value2;
        this.value3 = value3;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_current_color,%s,%s,%s),",value,value2,value3);
    }
}
