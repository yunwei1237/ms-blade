package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class SetVisitor implements Operation {

    

    public SetVisitor() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(set_visitor),");
    }
}
