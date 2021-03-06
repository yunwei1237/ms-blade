package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_script_param_1,<destination>),  --(Within a script) stores the first script parameter.
 */
public class StoreScriptParam1 implements Operation{

    private Variable destination;

    public StoreScriptParam1(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_script_param_1,%s),",destination);
    }
}
