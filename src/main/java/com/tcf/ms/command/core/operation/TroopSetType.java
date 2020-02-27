package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_set_type,<troop_id>,<gender>),
 */
public class TroopSetType implements Operation{

    private Variable troopId;
    private Variable gender;

    public TroopSetType(Variable troopId,Variable gender) {
        this.troopId = troopId;
        this.gender = gender;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_set_type,%s,%s),",troopId,gender);
    }
}
