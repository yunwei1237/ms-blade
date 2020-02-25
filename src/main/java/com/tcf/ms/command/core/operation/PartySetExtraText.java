package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartySetExtraText implements Operation {

    private Variable partyId;
    private Variable string;

    public PartySetExtraText(Variable partyId, Variable string) {
        this.partyId = partyId;
        this.string = string;
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_extra_text,%s,%s),",this.partyId,this.string);
    }
}
