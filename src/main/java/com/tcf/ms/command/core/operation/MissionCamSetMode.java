package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_cam_set_mode, <mission_cam_mode>, <duration-in-1/1000-seconds>, <value>)   when leaving manual mode, duration defines the animation time from the initial position to the new position. set as 0 for instant camera position update  if value = 0, then camera velocity will be linear. else it will be non-linear
 */
public class MissionCamSetMode implements Operation{

    private Variable missionCamMode;
    private Variable duration;
    private Variable value;

    public MissionCamSetMode(Variable missionCamMode,Variable duration,Variable value) {
        this.missionCamMode = missionCamMode;
        this.duration = duration;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_set_mode,%s,%s,%s),",missionCamMode,duration,value);
    }
}
