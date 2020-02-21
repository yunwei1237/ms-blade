package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddGoldToParty implements Operation {

    private Variable value;
    private Variable partyId;

    public AddGoldToParty(Variable value,Variable partyId) {
        this.value = value;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_gold_to_party,%s,%s),",value,partyId);
    }
}
