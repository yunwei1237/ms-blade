package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_proficiency_level,<destination>,<troop_id>,<attribute_id>),
 */
public class StoreProficiencyLevel implements Operation{

    private Variable destination;
    private Variable troopId;
    private Variable attributeId;

    public StoreProficiencyLevel(Variable destination,Variable troopId,Variable attributeId) {
        this.destination = destination;
        this.troopId = troopId;
        this.attributeId = attributeId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_proficiency_level,%s,%s,%s),",destination,troopId,attributeId);
    }
}
