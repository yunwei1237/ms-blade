package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (try_end),
 */
public class TryEnd implements Operation{

    

    public TryEnd() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(try_end),");
    }
}
