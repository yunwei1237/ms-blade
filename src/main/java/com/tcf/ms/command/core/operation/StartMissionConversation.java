package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (start_mission_conversation,<troop_id>),
 */
public class StartMissionConversation implements Operation{

    private Variable troopId;

    public StartMissionConversation(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(start_mission_conversation,%s),",troopId);
    }
}
