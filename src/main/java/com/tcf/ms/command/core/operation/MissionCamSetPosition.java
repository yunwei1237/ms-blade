package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionCamSetPosition implements Operation {

    

    public MissionCamSetPosition() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_set_position),");
    }
}