package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_get_simple_behavior, <destination>, <agent_id>),  constants are written in header_mission_templates.py, starting with aisb_
 */
public class AgentGetSimpleBehavior implements Operation{

    private Variable destination;
    private Variable agentId;

    public AgentGetSimpleBehavior(Variable destination,Variable agentId) {
        this.destination = destination;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_simple_behavior,%s,%s),",destination,agentId);
    }
}
