package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

@Deprecated
public class EndTry implements Operation {

    

    public EndTry() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(end_try),");
    }
}
