package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (start_map_conversation,<troop_id>),
 */
public class StartMapConversation implements Operation{

    private Variable troopId;

    public StartMapConversation(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(start_map_conversation,%s),",troopId);
    }
}
