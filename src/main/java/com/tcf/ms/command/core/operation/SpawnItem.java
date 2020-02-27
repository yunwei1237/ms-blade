package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (spawn_item, <item_kind_id>, <item_modifier>) 
 */
public class SpawnItem implements Operation{

    private Variable itemKindId;
    private Variable itemModifier;

    public SpawnItem(Variable itemKindId,Variable itemModifier) {
        this.itemKindId = itemKindId;
        this.itemModifier = itemModifier;     
    }

    @Override
    public String toScriptString() {
        return String.format("(spawn_item,%s,%s),",itemKindId,itemModifier);
    }
}
