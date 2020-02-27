package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (spawn_agent,<troop_id>), (stores agent_id in reg0)
 */
public class SpawnAgent implements Operation{

    private Variable troopId;

    public SpawnAgent(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(spawn_agent,%s),",troopId);
    }
}
