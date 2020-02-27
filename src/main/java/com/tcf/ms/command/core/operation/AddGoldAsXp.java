package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (add_gold_as_xp,<value>,[troop_id]),
 */
public class AddGoldAsXp implements Operation{

    private Variable value;
    private Variable troopId;

    public AddGoldAsXp(Variable value,Variable troopId) {
        this.value = value;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_gold_as_xp,%s,%s),",value,troopId);
    }
}
