package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_get_upgrade_troop,<destination>,<troop_id>,<upgrade_path>),  upgrade_path can be: 0 = random, 1 = getGroup first node, 2 = getGroup second node (returns -1 if not available)
 */
public class TroopGetUpgradeTroop implements Operation{

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
