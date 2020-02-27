package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_num_parties_destroyed_by_player,<destination>,<party_template_id>),
 */
public class StoreNumPartiesDestroyedByPlayer implements Operation{

    private Variable destination;
    private Variable partyTemplateId;

    public StoreNumPartiesDestroyedByPlayer(Variable destination,Variable partyTemplateId) {
        this.destination = destination;
        this.partyTemplateId = partyTemplateId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_num_parties_destroyed_by_player,%s,%s),",destination,partyTemplateId);
    }
}
