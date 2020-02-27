package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (agent_is_wounded,<agent_id>),
 */
public class AgentIsWounded implements Conditable{

    private Variable agentId;

    public AgentIsWounded(Variable agentId) {
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_is_wounded,%s),",agentId);
    }
}
