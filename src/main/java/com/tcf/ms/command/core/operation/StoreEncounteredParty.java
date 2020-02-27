package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_encountered_party,<destination>),
 */
public class StoreEncounteredParty implements Operation{

    private Variable destination;

    public StoreEncounteredParty(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_encountered_party,%s),",destination);
    }
}
