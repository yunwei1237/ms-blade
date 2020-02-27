package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_cam_get_aparture, <destination>)
 */
public class MissionCamGetAparture implements Operation{

    private Variable destination;

    public MissionCamGetAparture(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_get_aparture,%s),",destination);
    }
}
