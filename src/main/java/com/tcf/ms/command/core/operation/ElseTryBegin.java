package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   deprecated, use else_try instead
 */
@Deprecated
public class ElseTryBegin implements Operation{

    

    public ElseTryBegin() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(else_try_begin),");
    }
}
