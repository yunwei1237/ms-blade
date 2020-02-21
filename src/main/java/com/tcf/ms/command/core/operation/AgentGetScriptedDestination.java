package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentGetScriptedDestination implements Operation {

    private Variable positionNo;
    private Variable agentId;

    public AgentGetScriptedDestination(Variable positionNo,Variable agentId) {
        this.positionNo = positionNo;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_scripted_destination,%s,%s),",positionNo,agentId);
    }
}
