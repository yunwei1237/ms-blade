package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_add_proficiency_points,<troop_id>,<value>),					
 */
public class TroopAddProficiencyPoints implements Operation{

    private Variable troopId;
    private Variable value;

    public TroopAddProficiencyPoints(Variable troopId,Variable value) {
        this.troopId = troopId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_add_proficiency_points,%s,%s),",troopId,value);
    }
}
