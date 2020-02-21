package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentDeliverDamageToAgent implements Operation {

    private Variable agentIdDeliverer;
    private Variable agentId;

    public AgentDeliverDamageToAgent(Variable agentIdDeliverer,Variable agentId) {
        this.agentIdDeliverer = agentIdDeliverer;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_deliver_damage_to_agent,%s,%s),",agentIdDeliverer,agentId);
    }
}
