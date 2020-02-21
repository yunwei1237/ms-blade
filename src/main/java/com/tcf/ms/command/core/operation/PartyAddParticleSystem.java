package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyAddParticleSystem implements Operation {

    private Variable partyId;
    private Variable particleSystemId;

    public PartyAddParticleSystem(Variable partyId,Variable particleSystemId) {
        this.partyId = partyId;
        this.particleSystemId = particleSystemId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_add_particle_system,%s,%s),",partyId,particleSystemId);
    }
}
