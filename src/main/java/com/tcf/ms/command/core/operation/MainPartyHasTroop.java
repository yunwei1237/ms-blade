package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class MainPartyHasTroop implements Operation ,Conditable{

    private Variable troopId;

    public MainPartyHasTroop(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(main_party_has_troop,%s),",troopId);
    }
}
