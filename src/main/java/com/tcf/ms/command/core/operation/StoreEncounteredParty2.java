package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_encountered_party2,<destination>),
 */
public class StoreEncounteredParty2 implements Operation{

    private Variable destination;

    public StoreEncounteredParty2(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_encountered_party2,%s),",destination);
    }
}
