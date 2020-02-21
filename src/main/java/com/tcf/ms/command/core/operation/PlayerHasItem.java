package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class PlayerHasItem implements Operation ,Conditable{

    private Variable itemId;

    public PlayerHasItem(Variable itemId) {
        this.itemId = itemId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(player_has_item,%s),",itemId);
    }
}
