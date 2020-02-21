package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StartEncounter implements Operation {

    private Variable partyId;

    public StartEncounter(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(start_encounter,%s),",partyId);
    }
}
