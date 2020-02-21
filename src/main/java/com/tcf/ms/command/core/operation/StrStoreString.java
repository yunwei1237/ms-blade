package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StrStoreString implements Operation {

    private Variable stringRegister;
    private Variable stringNo;

    public StrStoreString(Variable stringRegister,Variable stringNo) {
        this.stringRegister = stringRegister;
        this.stringNo = stringNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_string,%s,%s),",stringRegister,stringNo);
    }
}
