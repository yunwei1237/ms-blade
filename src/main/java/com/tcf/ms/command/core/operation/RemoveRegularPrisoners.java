package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (remove_regular_prisoners,<party_id>),
 */
public class RemoveRegularPrisoners implements Operation{

    private Variable partyId;

    public RemoveRegularPrisoners(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(remove_regular_prisoners,%s),",partyId);
    }
}
