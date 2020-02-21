package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopInventorySlotGetItemMaxAmount implements Operation {

    private Variable destination;
    private Variable troopId;
    private Variable inventorySlotNo;

    public TroopInventorySlotGetItemMaxAmount(Variable destination,Variable troopId,Variable inventorySlotNo) {
        this.destination = destination;
        this.troopId = troopId;
        this.inventorySlotNo = inventorySlotNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_inventory_slot_get_item_max_amount,%s,%s,%s),",destination,troopId,inventorySlotNo);
    }
}
