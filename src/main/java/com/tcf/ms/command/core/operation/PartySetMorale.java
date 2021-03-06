package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_set_morale, <party_id>, <value>),  value is clamped to range [0...100].
 */
public class PartySetMorale implements Operation{

    private Variable partyId;
    private Variable value;

    public PartySetMorale(Variable partyId,Variable value) {
        this.partyId = partyId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_morale,%s,%s),",partyId,value);
    }
}
