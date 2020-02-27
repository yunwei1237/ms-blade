package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_get_skill_level, <destination>, <party_id>, <skill_no>),
 */
public class PartyGetSkillLevel implements Operation{

    private Variable destination;
    private Variable partyId;
    private Variable skillNo;

    public PartyGetSkillLevel(Variable destination,Variable partyId,Variable skillNo) {
        this.destination = destination;
        this.partyId = partyId;
        this.skillNo = skillNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_skill_level,%s,%s,%s),",destination,partyId,skillNo);
    }
}
