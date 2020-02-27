package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (particle_system_burst,<par_sys_id>,<position_no>,[percentage_burst_strength]),
 */
public class ParticleSystemBurst implements Operation{

    private Variable parSysId;
    private Variable positionNo;
    private Variable percentageBurstStrength;

    public ParticleSystemBurst(Variable parSysId,Variable positionNo,Variable percentageBurstStrength) {
        this.parSysId = parSysId;
        this.positionNo = positionNo;
        this.percentageBurstStrength = percentageBurstStrength;     
    }

    @Override
    public String toScriptString() {
        return String.format("(particle_system_burst,%s,%s,%s),",parSysId,positionNo,percentageBurstStrength);
    }
}
