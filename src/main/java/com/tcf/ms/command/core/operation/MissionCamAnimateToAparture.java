package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionCamAnimateToAparture implements Operation {

    

    public MissionCamAnimateToAparture() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_animate_to_aparture),");
    }
}
