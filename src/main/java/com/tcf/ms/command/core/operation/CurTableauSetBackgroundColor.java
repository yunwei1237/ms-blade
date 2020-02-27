package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_tableau_set_background_color, <value>),
 */
public class CurTableauSetBackgroundColor implements Operation{

    private Variable value;

    public CurTableauSetBackgroundColor(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_set_background_color,%s),",value);
    }
}
