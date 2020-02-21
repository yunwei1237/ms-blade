package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartySetName implements Operation {

    private Variable partyId;
    private Variable stringNo;

    public PartySetName(Variable partyId,Variable stringNo) {
        this.partyId = partyId;
        this.stringNo = stringNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_name,%s,%s),",partyId,stringNo);
    }
}
