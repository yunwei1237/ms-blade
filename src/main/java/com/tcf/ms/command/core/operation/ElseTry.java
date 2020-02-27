package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (else_try),
 */
public class ElseTry implements Operation{

    

    public ElseTry() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(else_try),");
    }
}
