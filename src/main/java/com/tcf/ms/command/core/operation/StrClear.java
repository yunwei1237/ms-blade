package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_clear, <string_register>)
 */
public class StrClear implements Operation{

    private Variable stringRegister;

    public StrClear(Variable stringRegister) {
        this.stringRegister = stringRegister;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_clear,%s),",stringRegister);
    }
}
