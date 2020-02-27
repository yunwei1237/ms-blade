package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   deprecated, use try_end instead
 */
@Deprecated
public class EndTry implements Operation{

    

    public EndTry() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(end_try),");
    }
}
