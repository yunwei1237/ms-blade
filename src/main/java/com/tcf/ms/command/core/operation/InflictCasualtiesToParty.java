package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class InflictCasualtiesToParty implements Operation {

    private Variable parentPartyId;
    private Variable attackRounds;
    private Variable partyIdToAddCausaltiesTo;

    public InflictCasualtiesToParty(Variable parentPartyId,Variable attackRounds,Variable partyIdToAddCausaltiesTo) {
        this.parentPartyId = parentPartyId;
        this.attackRounds = attackRounds;
        this.partyIdToAddCausaltiesTo = partyIdToAddCausaltiesTo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(inflict_casualties_to_party,%s,%s,%s),",parentPartyId,attackRounds,partyIdToAddCausaltiesTo);
    }
}
