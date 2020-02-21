package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreFactionOfParty implements Operation {

    private Variable destination;

    public StoreFactionOfParty(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_faction_of_party,%s),",destination);
    }
}
