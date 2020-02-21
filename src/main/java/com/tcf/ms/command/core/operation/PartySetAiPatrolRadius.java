package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartySetAiPatrolRadius implements Operation {

    private Variable partyId;
    private Variable radiusInKm;

    public PartySetAiPatrolRadius(Variable partyId,Variable radiusInKm) {
        this.partyId = partyId;
        this.radiusInKm = radiusInKm;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_ai_patrol_radius,%s,%s),",partyId,radiusInKm);
    }
}
