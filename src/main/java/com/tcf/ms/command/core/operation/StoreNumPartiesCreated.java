package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreNumPartiesCreated implements Operation {

    private Variable destination;
    private Variable partyTemplateId;

    public StoreNumPartiesCreated(Variable destination,Variable partyTemplateId) {
        this.destination = destination;
        this.partyTemplateId = partyTemplateId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_num_parties_created,%s,%s),",destination,partyTemplateId);
    }
}
