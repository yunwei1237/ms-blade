package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_set_ai_initiative,<party_id>,<value>),  value is between 0-100
 */
public class PartySetAiInitiative implements Operation{

    private Variable partyId;
    private Variable value;

    public PartySetAiInitiative(Variable partyId,Variable value) {
        this.partyId = partyId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_ai_initiative,%s,%s),",partyId,value);
    }
}
