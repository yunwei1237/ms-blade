package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_get_inventory_slot_modifier,<destination>,<troop_id>,<inventory_slot_no>),
 */
public class TroopGetInventorySlotModifier implements Operation{

    private Variable destination;
    private Variable troopId;
    private Variable inventorySlotNo;

    public TroopGetInventorySlotModifier(Variable destination,Variable troopId,Variable inventorySlotNo) {
        this.destination = destination;
        this.troopId = troopId;
        this.inventorySlotNo = inventorySlotNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_get_inventory_slot_modifier,%s,%s,%s),",destination,troopId,inventorySlotNo);
    }
}
