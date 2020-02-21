package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartySetFlag implements Operation {

    private Variable partyId;
    private Variable flag;
    private Variable clearOrSet;

    public PartySetFlag(Variable partyId,Variable flag,Variable clearOrSet) {
        this.partyId = partyId;
        this.flag = flag;
        this.clearOrSet = clearOrSet;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_flag,%s,%s,%s),",partyId,flag,clearOrSet);
    }
}
