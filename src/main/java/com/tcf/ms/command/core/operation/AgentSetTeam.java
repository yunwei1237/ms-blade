package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentSetTeam implements Operation {

    private Variable agentId;
    private Variable value;

    public AgentSetTeam(Variable agentId,Variable value) {
        this.agentId = agentId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_team,%s,%s),",agentId,value);
    }
}
