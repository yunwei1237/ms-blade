package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_clear_particle_systems, <party_id>),
 */
public class PartyClearParticleSystems implements Operation{

    private Variable partyId;

    public PartyClearParticleSystems(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_clear_particle_systems,%s),",partyId);
    }
}
