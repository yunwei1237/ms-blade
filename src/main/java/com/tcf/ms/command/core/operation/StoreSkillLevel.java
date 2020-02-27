package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_skill_level,<destination>,<skill_id>,[troop_id]),
 */
public class StoreSkillLevel implements Operation{

    private Variable destination;
    private Variable skillId;
    private Variable troopId;

    public StoreSkillLevel(Variable destination,Variable skillId,Variable troopId) {
        this.destination = destination;
        this.skillId = skillId;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_skill_level,%s,%s,%s),",destination,skillId,troopId);
    }
}
