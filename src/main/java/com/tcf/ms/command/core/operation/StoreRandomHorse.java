package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_random_horse,<destination>)
 */
public class StoreRandomHorse implements Operation{

    private Variable destination;

    public StoreRandomHorse(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_random_horse,%s),",destination);
    }
}
