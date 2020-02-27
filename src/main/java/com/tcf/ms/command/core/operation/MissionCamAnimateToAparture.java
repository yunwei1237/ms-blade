package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_cam_animate_to_aparture, <value>, <duration-in-1/1000-seconds>, <value>)   if value = 0, then camera velocity will be linear. else it will be non-linear
 */
public class MissionCamAnimateToAparture implements Operation{

    private Variable value;
    private Variable duration;
    private Variable value2;

    public MissionCamAnimateToAparture(Variable value,Variable duration,Variable value2) {
        this.value = value;
        this.duration = duration;
        this.value2 = value2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_animate_to_aparture,%s,%s,%s),",value,duration,value2);
    }
}
