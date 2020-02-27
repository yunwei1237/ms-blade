package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_set_inventory_slot_modifier,<troop_id>,<inventory_slot_no>,<value>),
 */
public class TroopSetInventorySlotModifier implements Operation{

    private Variable troopId;
    private Variable inventorySlotNo;
    private Variable value;

    public TroopSetInventorySlotModifier(Variable troopId,Variable inventorySlotNo,Variable value) {
        this.troopId = troopId;
        this.inventorySlotNo = inventorySlotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_set_inventory_slot_modifier,%s,%s,%s),",troopId,inventorySlotNo,value);
    }
}
