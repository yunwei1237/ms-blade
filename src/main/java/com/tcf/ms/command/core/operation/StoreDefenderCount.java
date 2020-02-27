package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_defender_count,<destination>),
 */
public class StoreDefenderCount implements Operation{

    private Variable destination;

    public StoreDefenderCount(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_defender_count,%s),",destination);
    }
}
