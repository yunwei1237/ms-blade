package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_set_scripted_destination,<agent_id>,<position_no>,<auto_set_z_to_ground_level>),  auto_set_z_to_ground_level can be 0 (false) or 1 (true)
 */
public class AgentSetScriptedDestination implements Operation{

    private Variable agentId;
    private Variable positionNo;
    private Variable autoSetZToGroundLevel;

    public AgentSetScriptedDestination(Variable agentId,Variable positionNo,Variable autoSetZToGroundLevel) {
        this.agentId = agentId;
        this.positionNo = positionNo;
        this.autoSetZToGroundLevel = autoSetZToGroundLevel;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_scripted_destination,%s,%s,%s),",agentId,positionNo,autoSetZToGroundLevel);
    }
}
