package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_get_team  ,<destination>, <agent_id>),
 */
public class AgentGetTeam implements Operation{

    private Variable destination;
    private Variable agentId;

    public AgentGetTeam(Variable destination,Variable agentId) {
        this.destination = destination;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_team,%s,%s),",destination,agentId);
    }
}
