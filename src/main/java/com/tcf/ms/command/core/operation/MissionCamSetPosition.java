package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_cam_set_position, <position_register_no>)
 */
public class MissionCamSetPosition implements Operation{

    private Variable positionRegisterNo;

    public MissionCamSetPosition(Variable positionRegisterNo) {
        this.positionRegisterNo = positionRegisterNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_set_position,%s),",positionRegisterNo);
    }
}
