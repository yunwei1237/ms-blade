package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentGetPosition implements Operation {

    private Variable positionNo;
    private Variable agentId;

    public AgentGetPosition(Variable positionNo,Variable agentId) {
        this.positionNo = positionNo;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_position,%s,%s),",positionNo,agentId);
    }
}
