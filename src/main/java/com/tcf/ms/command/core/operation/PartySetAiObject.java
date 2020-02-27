package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_set_ai_object,<party_id>,<party_id>),
 */
public class PartySetAiObject implements Operation{

    private Variable partyId;
    private Variable partyId2;

    public PartySetAiObject(Variable partyId,Variable partyId2) {
        this.partyId = partyId;
        this.partyId2 = partyId2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_ai_object,%s,%s),",partyId,partyId2);
    }
}
