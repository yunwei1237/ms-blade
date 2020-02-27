package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (reset_visitors),
 */
public class ResetVisitors implements Operation{

    

    public ResetVisitors() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(reset_visitors),");
    }
}
