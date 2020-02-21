package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentSetAnimationProgress implements Operation {

    private Variable agentId;
    private Variable valueFixedPoint;

    public AgentSetAnimationProgress(Variable agentId,Variable valueFixedPoint) {
        this.agentId = agentId;
        this.valueFixedPoint = valueFixedPoint;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_animation_progress,%s,%s),",agentId,valueFixedPoint);
    }
}
