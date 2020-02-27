package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_cam_animate_to_position, <position_register_no>, <duration-in-1/1000-seconds>, <value>)   if value = 0, then camera velocity will be linear. else it will be non-linear
 */
public class MissionCamAnimateToPosition implements Operation{

    private Variable positionRegisterNo;
    private Variable duration;
    private Variable value;

    public MissionCamAnimateToPosition(Variable positionRegisterNo,Variable duration,Variable value) {
        this.positionRegisterNo = positionRegisterNo;
        this.duration = duration;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_animate_to_position,%s,%s,%s),",positionRegisterNo,duration,value);
    }
}
