package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_set_faction,<troop_id>,<faction_id>),
 */
public class TroopSetFaction implements Operation{

    private Variable troopId;
    private Variable factionId;

    public TroopSetFaction(Variable troopId,Variable factionId) {
        this.troopId = troopId;
        this.factionId = factionId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_set_faction,%s,%s),",troopId,factionId);
    }
}
