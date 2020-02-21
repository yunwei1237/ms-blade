package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionCamGetPosition implements Operation {

    

    public MissionCamGetPosition() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_get_position),");
    }
}
