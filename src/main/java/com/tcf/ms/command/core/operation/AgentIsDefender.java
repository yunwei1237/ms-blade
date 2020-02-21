package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class AgentIsDefender implements Operation ,Conditable{

    private Variable agentId;

    public AgentIsDefender(Variable agentId) {
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_is_defender,%s),",agentId);
    }
}
