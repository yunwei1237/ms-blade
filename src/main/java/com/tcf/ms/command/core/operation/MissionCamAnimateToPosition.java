package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionCamAnimateToPosition implements Operation {

    

    public MissionCamAnimateToPosition() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_animate_to_position),");
    }
}
