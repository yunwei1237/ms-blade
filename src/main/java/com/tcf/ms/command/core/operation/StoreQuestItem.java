package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_quest_item,<destination>,<item_id>),
 */
public class StoreQuestItem implements Operation{

    private Variable destination;
    private Variable itemId;

    public StoreQuestItem(Variable destination,Variable itemId) {
        this.destination = destination;
        this.itemId = itemId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_quest_item,%s,%s),",destination,itemId);
    }
}
