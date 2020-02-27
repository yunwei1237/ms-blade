package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (agent_is_human,<agent_id>),
 */
public class AgentIsHuman implements Conditable{

    private Variable agentId;

    public AgentIsHuman(Variable agentId) {
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_is_human,%s),",agentId);
    }
}
