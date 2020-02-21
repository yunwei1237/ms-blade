package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentSetScriptedDestination implements Operation {

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
