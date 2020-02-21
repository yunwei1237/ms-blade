package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionCamSetTargetAgent implements Operation {

    

    public MissionCamSetTargetAgent() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_set_target_agent),");
    }
}
