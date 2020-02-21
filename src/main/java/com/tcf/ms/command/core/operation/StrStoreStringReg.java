package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class StrStoreStringReg implements Operation {

    

    public StrStoreStringReg() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_string_reg),");
    }
}
