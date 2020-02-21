package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentSetPosition implements Operation {

    private Variable agentId;
    private Variable positionNo;

    public AgentSetPosition(Variable agentId,Variable positionNo) {
        this.agentId = agentId;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_position,%s,%s),",agentId,positionNo);
    }
}
