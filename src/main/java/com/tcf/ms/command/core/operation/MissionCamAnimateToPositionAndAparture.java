package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_cam_animate_to_position_and_aparture, <position_register_no>, <value>, <duration-in-1/1000-seconds>, <value>)   if value = 0, then camera velocity will be linear. else it will be non-linear
 */
public class MissionCamAnimateToPositionAndAparture implements Operation{

    private Variable positionRegisterNo;
    private Variable value;
    private Variable duration;
    private Variable value2;

    public MissionCamAnimateToPositionAndAparture(Variable positionRegisterNo,Variable value,Variable duration,Variable value2) {
        this.positionRegisterNo = positionRegisterNo;
        this.value = value;
        this.duration = duration;
        this.value2 = value2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_animate_to_position_and_aparture,%s,%s,%s,%s),",positionRegisterNo,value,duration,value2);
    }
}
