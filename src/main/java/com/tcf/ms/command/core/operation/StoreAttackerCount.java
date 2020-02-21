package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreAttackerCount implements Operation {

    private Variable destination;

    public StoreAttackerCount(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_attacker_count,%s),",destination);
    }
}
