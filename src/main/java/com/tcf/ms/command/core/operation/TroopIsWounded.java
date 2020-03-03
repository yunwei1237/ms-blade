package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (troop_is_wounded,<troop_id>),  only for heroes!
 */
public class TroopIsWounded implements Conditable{

    private Variable troopId;

    public TroopIsWounded(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_is_wounded,%s),",troopId);
    }
}
