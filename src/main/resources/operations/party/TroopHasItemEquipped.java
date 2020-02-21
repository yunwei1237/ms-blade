package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopHasItemEquipped implements Operation , Conditable {
    /**
     * 兵种id
     */
    private Variable troopId;
    /**
     * 物品id
     */
    private Variable itemId;

    public TroopHasItemEquipped(Variable troopId,Variable itemId) {
        this.troopId = troopId;
        this.itemId = itemId;
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_has_item_equipped,%s),",troopId,itemId);
    }
}
