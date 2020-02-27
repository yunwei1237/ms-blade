package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_cam_clear_target_agent)
 */
public class MissionCamClearTargetAgent implements Operation{

    

    public MissionCamClearTargetAgent() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_clear_target_agent),");
    }
}
