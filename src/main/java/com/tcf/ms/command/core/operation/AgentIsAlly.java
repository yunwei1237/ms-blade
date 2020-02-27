package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (agent_is_ally,<agent_id>),
 */
public class AgentIsAlly implements Conditable{

    private Variable agentId;

    public AgentIsAlly(Variable agentId) {
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_is_ally,%s),",agentId);
    }
}
