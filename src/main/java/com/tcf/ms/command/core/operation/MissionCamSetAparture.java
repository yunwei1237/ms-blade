package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class MissionCamSetAparture implements Operation {

    

    public MissionCamSetAparture() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_set_aparture),");
    }
}
