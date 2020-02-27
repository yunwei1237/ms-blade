package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   set absolute to 1 to retrieve actual hps, otherwise will return relative hp in range [0..100]  (store_agent_hit_points,<destination>,<agent_id>,[absolute]),
 */
public class StoreAgentHitPoints implements Operation{

    private Variable destination;
    private Variable agentId;
    private Variable absolute;

    public StoreAgentHitPoints(Variable destination,Variable agentId,Variable absolute) {
        this.destination = destination;
        this.agentId = agentId;
        this.absolute = absolute;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_agent_hit_points,%s,%s,%s),",destination,agentId,absolute);
    }
}
