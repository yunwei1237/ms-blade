package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   ID of spawned party is put into reg(0)  (spawn_around_party,<party_id>,<party_template_id>),
 */
public class SpawnAroundParty implements Operation{

    private Variable partyId;
    private Variable partyTemplateId;

    public SpawnAroundParty(Variable partyId,Variable partyTemplateId) {
        this.partyId = partyId;
        this.partyTemplateId = partyTemplateId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(spawn_around_party,%s,%s),",partyId,partyTemplateId);
    }
}
