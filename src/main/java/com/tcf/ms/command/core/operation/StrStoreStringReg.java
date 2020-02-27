package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_store_string,<string_register>,<string_no>),  copies one string register to another.
 */
public class StrStoreStringReg implements Operation{

    private Variable stringRegister;
    private Variable stringNo;

    public StrStoreStringReg(Variable stringRegister,Variable stringNo) {
        this.stringRegister = stringRegister;
        this.stringNo = stringNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_string_reg,%s,%s),",stringRegister,stringNo);
    }
}
