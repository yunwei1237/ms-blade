package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_set_stand_action, <agent_id>, <anim_id>),
 */
public class AgentSetStandAnimation implements Operation{

    private Variable agentId;
    private Variable animId;

    public AgentSetStandAnimation(Variable agentId,Variable animId) {
        this.agentId = agentId;
        this.animId = animId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_stand_animation,%s,%s),",agentId,animId);
    }
}
