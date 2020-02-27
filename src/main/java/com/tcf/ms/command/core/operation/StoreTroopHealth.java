package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_troop_health,<destination>,<troop_id>,[absolute]),  set absolute to 1 to getGroup actual health; otherwise this will return percentage health in range (0-100)
 */
public class StoreTroopHealth implements Operation{

    private Variable destination;
    private Variable troopId;
    private Variable absolute;

    public StoreTroopHealth(Variable destination,Variable troopId,Variable absolute) {
        this.destination = destination;
        this.troopId = troopId;
        this.absolute = absolute;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_troop_health,%s,%s,%s),",destination,troopId,absolute);
    }
}
