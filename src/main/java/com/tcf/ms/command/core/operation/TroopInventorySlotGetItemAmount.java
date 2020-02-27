package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_inventory_slot_get_item_amount,<destination>,<troop_id>,<inventory_slot_no>),
 */
public class TroopInventorySlotGetItemAmount implements Operation{

    private Variable destination;
    private Variable troopId;
    private Variable inventorySlotNo;

    public TroopInventorySlotGetItemAmount(Variable destination,Variable troopId,Variable inventorySlotNo) {
        this.destination = destination;
        this.troopId = troopId;
        this.inventorySlotNo = inventorySlotNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_inventory_slot_get_item_amount,%s,%s,%s),",destination,troopId,inventorySlotNo);
    }
}
