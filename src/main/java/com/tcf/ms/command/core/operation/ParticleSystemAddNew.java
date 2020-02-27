package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (particle_system_add_new,<par_sys_id>,[position_no]),
 */
public class ParticleSystemAddNew implements Operation{

    private Variable parSysId;
    private Variable positionNo;

    public ParticleSystemAddNew(Variable parSysId,Variable positionNo) {
        this.parSysId = parSysId;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(particle_system_add_new,%s,%s),",parSysId,positionNo);
    }
}
