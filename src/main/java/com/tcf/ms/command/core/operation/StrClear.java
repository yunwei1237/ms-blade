package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class StrClear implements Operation {

    

    public StrClear() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(str_clear),");
    }
}
