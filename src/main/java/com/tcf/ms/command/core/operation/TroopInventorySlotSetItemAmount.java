package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopInventorySlotSetItemAmount implements Operation {

    private Variable troopId;
    private Variable inventorySlotNo;
    private Variable value;

    public TroopInventorySlotSetItemAmount(Variable troopId,Variable inventorySlotNo,Variable value) {
        this.troopId = troopId;
        this.inventorySlotNo = inventorySlotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_inventory_slot_set_item_amount,%s,%s,%s),",troopId,inventorySlotNo,value);
    }
}
