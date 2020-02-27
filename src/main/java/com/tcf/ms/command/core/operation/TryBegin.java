package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (try_begin),
 */
public class TryBegin implements Operation{

    

    public TryBegin() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(try_begin),");
    }
}
