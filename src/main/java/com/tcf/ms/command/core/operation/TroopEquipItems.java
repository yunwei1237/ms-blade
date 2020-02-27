package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_equip_items,<troop_id>),  equips the items in the inventory automatically
 */
public class TroopEquipItems implements Operation{

    private Variable troopId;

    public TroopEquipItems(Variable troopId) {
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_equip_items,%s),",troopId);
    }
}
