package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_cam_get_position, <position_register_no>)
 */
public class MissionCamGetPosition implements Operation{

    private Variable positionRegisterNo;

    public MissionCamGetPosition(Variable positionRegisterNo) {
        this.positionRegisterNo = positionRegisterNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_get_position,%s),",positionRegisterNo);
    }
}
