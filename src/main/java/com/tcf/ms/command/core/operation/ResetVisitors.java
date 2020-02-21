package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ResetVisitors implements Operation {

    

    public ResetVisitors() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(reset_visitors),");
    }
}
