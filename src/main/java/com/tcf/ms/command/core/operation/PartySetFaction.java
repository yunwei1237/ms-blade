package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_set_faction,<party_id>,<faction_id>),
 */
public class PartySetFaction implements Operation{

    private Variable partyId;
    private Variable factionId;

    public PartySetFaction(Variable partyId,Variable factionId) {
        this.partyId = partyId;
        this.factionId = factionId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_faction,%s,%s),",partyId,factionId);
    }
}
