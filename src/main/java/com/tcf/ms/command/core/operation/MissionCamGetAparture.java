package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionCamGetAparture implements Operation {

    

    public MissionCamGetAparture() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_get_aparture),");
    }
}
