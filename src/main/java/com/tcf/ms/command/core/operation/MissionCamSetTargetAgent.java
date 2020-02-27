package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (mission_cam_set_target_agent, <agent_id>, <value>)  if value = 0 then do not use agent's rotation, else use agent's rotation
 */
public class MissionCamSetTargetAgent implements Operation{

    private Variable agentId;
    private Variable value;

    public MissionCamSetTargetAgent(Variable agentId,Variable value) {
        this.agentId = agentId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(mission_cam_set_target_agent,%s,%s),",agentId,value);
    }
}
