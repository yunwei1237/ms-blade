package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (particle_system_emit,<par_sys_id>,<value_num_particles>,<value_period>),
 */
public class ParticleSystemEmit implements Operation{

    private Variable parSysId;
    private Variable valueNumParticles;
    private Variable valuePeriod;

    public ParticleSystemEmit(Variable parSysId,Variable valueNumParticles,Variable valuePeriod) {
        this.parSysId = parSysId;
        this.valueNumParticles = valueNumParticles;
        this.valuePeriod = valuePeriod;     
    }

    @Override
    public String toScriptString() {
        return String.format("(particle_system_emit,%s,%s,%s),",parSysId,valueNumParticles,valuePeriod);
    }
}
