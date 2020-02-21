package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentGetAmmo implements Operation {

    private Variable destination;
    private Variable agentId;

    public AgentGetAmmo(Variable destination,Variable agentId) {
        this.destination = destination;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_ammo,%s,%s),",destination,agentId);
    }
}
