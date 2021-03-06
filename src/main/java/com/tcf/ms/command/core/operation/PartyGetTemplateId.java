package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_get_template_id,<destination>,<party_id>),
 */
public class PartyGetTemplateId implements Operation{

    private Variable destination;
    private Variable partyId;

    public PartyGetTemplateId(Variable destination,Variable partyId) {
        this.destination = destination;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_template_id,%s,%s),",destination,partyId);
    }
}
