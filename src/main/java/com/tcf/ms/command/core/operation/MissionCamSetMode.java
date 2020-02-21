package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionCamSetMode implements Operation {

    

    public MissionCamSetMode() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_set_mode),");
    }
}
