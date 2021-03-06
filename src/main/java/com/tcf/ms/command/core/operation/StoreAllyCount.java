package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_ally_count,<destination>),
 */
public class StoreAllyCount implements Operation{

    private Variable destination;

    public StoreAllyCount(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_ally_count,%s),",destination);
    }
}
