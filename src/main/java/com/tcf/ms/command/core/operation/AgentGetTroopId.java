package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentGetTroopId implements Operation {

    private Variable destination;
    private Variable agentId;

    public AgentGetTroopId(Variable destination,Variable agentId) {
        this.destination = destination;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_troop_id,%s,%s),",destination,agentId);
    }
}
