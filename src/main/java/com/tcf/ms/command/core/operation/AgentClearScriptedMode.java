package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_clear_scripted_mode,<agent_id>),
 */
public class AgentClearScriptedMode implements Operation{

    private Variable agentId;

    public AgentClearScriptedMode(Variable agentId) {
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_clear_scripted_mode,%s),",agentId);
    }
}
