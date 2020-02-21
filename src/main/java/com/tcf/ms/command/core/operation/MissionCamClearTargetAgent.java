package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionCamClearTargetAgent implements Operation {

    

    public MissionCamClearTargetAgent() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_clear_target_agent),");
    }
}
