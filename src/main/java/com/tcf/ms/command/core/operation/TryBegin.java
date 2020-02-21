package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class TryBegin implements Operation {

    

    public TryBegin() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(try_begin),");
    }
}
