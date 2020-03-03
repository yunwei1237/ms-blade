package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_set_speed_limit,<agent_id>,<speed_limit(kilometers/hour)>),  Affects AI only 
 */
public class AgentSetSpeedLimit implements Operation{

    private Variable agentId;
    private Variable speedLimit;

    public AgentSetSpeedLimit(Variable agentId,Variable speedLimit) {
        this.agentId = agentId;
        this.speedLimit = speedLimit;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_speed_limit,%s,%s),",agentId,speedLimit);
    }
}
