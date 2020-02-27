package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_set_inventory_slot,<troop_id>,<inventory_slot_no>,<value>),
 */
public class TroopSetInventorySlot implements Operation{

    private Variable troopId;
    private Variable inventorySlotNo;
    private Variable value;

    public TroopSetInventorySlot(Variable troopId,Variable inventorySlotNo,Variable value) {
        this.troopId = troopId;
        this.inventorySlotNo = inventorySlotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_set_inventory_slot,%s,%s,%s),",troopId,inventorySlotNo,value);
    }
}
