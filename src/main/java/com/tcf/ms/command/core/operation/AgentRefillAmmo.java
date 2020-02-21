package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentRefillAmmo implements Operation {

    private Variable agentId;

    public AgentRefillAmmo(Variable agentId) {
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_refill_ammo,%s),",agentId);
    }
}
