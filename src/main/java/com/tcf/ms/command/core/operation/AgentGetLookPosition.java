package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_get_look_position, <position_no>, <agent_id>),
 */
public class AgentGetLookPosition implements Operation{

    private Variable positionNo;
    private Variable agentId;

    public AgentGetLookPosition(Variable positionNo,Variable agentId) {
        this.positionNo = positionNo;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_look_position,%s,%s),",positionNo,agentId);
    }
}
