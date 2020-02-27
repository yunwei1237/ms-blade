package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_tableau_set_override_flags, <value>),
 */
public class CurTableauSetOverrideFlags implements Operation{

    private Variable value;

    public CurTableauSetOverrideFlags(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_set_override_flags,%s),",value);
    }
}
