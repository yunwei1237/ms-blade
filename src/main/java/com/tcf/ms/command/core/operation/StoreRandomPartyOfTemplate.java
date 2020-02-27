package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   fails if no party exists with tempolate_id (expensive)  (store_random_party_of_template,<destination>,<party_template_id>),
 */
public class StoreRandomPartyOfTemplate implements Operation{

    private Variable destination;
    private Variable partyTemplateId;

    public StoreRandomPartyOfTemplate(Variable destination,Variable partyTemplateId) {
        this.destination = destination;
        this.partyTemplateId = partyTemplateId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_random_party_of_template,%s,%s),",destination,partyTemplateId);
    }
}
