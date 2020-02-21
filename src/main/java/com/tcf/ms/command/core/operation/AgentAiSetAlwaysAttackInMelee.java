package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentAiSetAlwaysAttackInMelee implements Operation {

    private Variable agentId;
    private Variable value;

    public AgentAiSetAlwaysAttackInMelee(Variable agentId,Variable value) {
        this.agentId = agentId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_ai_set_always_attack_in_melee,%s,%s),",agentId,value);
    }
}
