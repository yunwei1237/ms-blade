package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_get_wielded_item,<destination>,<agent_id>,<hand_no>),
 */
public class AgentGetWieldedItem implements Operation{

    private Variable destination;
    private Variable agentId;
    private Variable handNo;

    public AgentGetWieldedItem(Variable destination,Variable agentId,Variable handNo) {
        this.destination = destination;
        this.agentId = agentId;
        this.handNo = handNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_wielded_item,%s,%s,%s),",destination,agentId,handNo);
    }
}
