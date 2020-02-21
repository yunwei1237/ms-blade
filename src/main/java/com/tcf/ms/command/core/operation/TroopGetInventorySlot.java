package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopGetInventorySlot implements Operation {

    private Variable destination;
    private Variable troopId;
    private Variable inventorySlotNo;

    public TroopGetInventorySlot(Variable destination,Variable troopId,Variable inventorySlotNo) {
        this.destination = destination;
        this.troopId = troopId;
        this.inventorySlotNo = inventorySlotNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_get_inventory_slot,%s,%s,%s),",destination,troopId,inventorySlotNo);
    }
}
