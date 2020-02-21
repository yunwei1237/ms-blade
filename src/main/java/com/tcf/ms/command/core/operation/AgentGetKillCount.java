package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentGetKillCount implements Operation {

    private Variable destination;
    private Variable agentId;
    private Variable getWounded;

    public AgentGetKillCount(Variable destination,Variable agentId,Variable getWounded) {
        this.destination = destination;
        this.agentId = agentId;
        this.getWounded = getWounded;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_kill_count,%s,%s,%s),",destination,agentId,getWounded);
    }
}
