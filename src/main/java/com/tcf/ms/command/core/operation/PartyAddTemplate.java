package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_add_template, <party_id>, <party_template_id>, [reverse_prisoner_status]),
 */
public class PartyAddTemplate implements Operation{

    private Variable partyId;
    private Variable partyTemplateId;
    private Variable reversePrisonerStatus;

    public PartyAddTemplate(Variable partyId,Variable partyTemplateId,Variable reversePrisonerStatus) {
        this.partyId = partyId;
        this.partyTemplateId = partyTemplateId;
        this.reversePrisonerStatus = reversePrisonerStatus;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_add_template,%s,%s,%s),",partyId,partyTemplateId,reversePrisonerStatus);
    }
}
