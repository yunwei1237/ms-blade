package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_get_item_id,<destination>, <agent_id>), (works only for horses, returns -1 otherwise)
 */
public class AgentGetItemId implements Operation{

    private Variable destination;
    private Variable agentId;

    public AgentGetItemId(Variable destination,Variable agentId) {
        this.destination = destination;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_item_id,%s,%s),",destination,agentId);
    }
}
