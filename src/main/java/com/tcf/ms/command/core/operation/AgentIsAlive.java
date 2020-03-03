package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (agent_is_alive,<agent_id>),
 */
public class AgentIsAlive implements Conditable{

    private Variable agentId;

    public AgentIsAlive(Variable agentId) {
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_is_alive,%s),",agentId);
    }
}
