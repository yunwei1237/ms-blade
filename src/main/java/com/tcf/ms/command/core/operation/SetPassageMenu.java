package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetPassageMenu implements Operation {

    private Variable value;

    public SetPassageMenu(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_passage_menu,%s),",value);
    }
}
