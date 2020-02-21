package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopGetUpgradeTroop implements Operation {

    private Variable destination;
    private Variable troopId;
    private Variable upgradePath;

    public TroopGetUpgradeTroop(Variable destination,Variable troopId,Variable upgradePath) {
        this.destination = destination;
        this.troopId = troopId;
        this.upgradePath = upgradePath;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_get_upgrade_troop,%s,%s,%s),",destination,troopId,upgradePath);
    }
}
