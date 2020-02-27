package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_remove_gold,<troop_id>,<value>),
 */
public class TroopRemoveGold implements Operation{

    private Variable troopId;
    private Variable value;

    public TroopRemoveGold(Variable troopId,Variable value) {
        this.troopId = troopId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_remove_gold,%s,%s),",troopId,value);
    }
}
