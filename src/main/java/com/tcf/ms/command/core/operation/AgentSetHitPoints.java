package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   set absolute to 1 if value is absolute, otherwise value will be treated as relative number in range [0..100]  (agent_set_hit_points,<agent_id>,<value>,[absolute]),
 */
public class AgentSetHitPoints implements Operation{

    private Variable agentId;
    private Variable value;
    private Variable absolute;

    public AgentSetHitPoints(Variable agentId,Variable value,Variable absolute) {
        this.agentId = agentId;
        this.value = value;
        this.absolute = absolute;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_hit_points,%s,%s,%s),",agentId,value,absolute);
    }
}
