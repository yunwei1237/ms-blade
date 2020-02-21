package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentSetAnimation implements Operation {

    private Variable agentId;
    private Variable animId;

    public AgentSetAnimation(Variable agentId,Variable animId) {
        this.agentId = agentId;
        this.animId = animId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_animation,%s,%s),",agentId,animId);
    }
}
