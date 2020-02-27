package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_store_string,<string_register>,<string_id>),
 */
public class StrStoreString implements Operation{

    private Variable stringRegister;
    private Variable stringId;

    public StrStoreString(Variable stringRegister,Variable stringId) {
        this.stringRegister = stringRegister;
        this.stringId = stringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_string,%s,%s),",stringRegister,stringId);
    }
}
