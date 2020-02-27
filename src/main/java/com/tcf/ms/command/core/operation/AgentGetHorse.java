package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_get_horse,<destination>,<agent_id>),
 */
public class AgentGetHorse implements Operation{

    private Variable destination;
    private Variable agentId;

    public AgentGetHorse(Variable destination,Variable agentId) {
        this.destination = destination;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_horse,%s,%s),",destination,agentId);
    }
}
