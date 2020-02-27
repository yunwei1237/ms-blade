package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (add_xp_to_troop,<value>,[troop_id]),
 */
public class AddXpToTroop implements Operation{

    private Variable value;
    private Variable troopId;

    public AddXpToTroop(Variable value,Variable troopId) {
        this.value = value;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_xp_to_troop,%s,%s),",value,troopId);
    }
}
