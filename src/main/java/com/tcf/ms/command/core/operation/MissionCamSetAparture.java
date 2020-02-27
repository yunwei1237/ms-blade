package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_cam_set_aparture, <value>)
 */
public class MissionCamSetAparture implements Operation{

    private Variable value;

    public MissionCamSetAparture(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_set_aparture,%s),",value);
    }
}
