package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

@Deprecated
public class ElseTryBegin implements Operation {

    

    public ElseTryBegin() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(else_try_begin),");
    }
}
