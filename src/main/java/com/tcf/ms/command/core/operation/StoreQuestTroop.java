package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_quest_troop,<destination>,<troop_id>),
 */
public class StoreQuestTroop implements Operation{

    private Variable destination;
    private Variable troopId;

    public StoreQuestTroop(Variable destination,Variable troopId) {
        this.destination = destination;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_quest_troop,%s,%s),",destination,troopId);
    }
}
