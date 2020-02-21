package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class PlayerHasItem implements Operation , Conditable {
    /**
     * 队伍id
     */
    private Variable itemId;

    public PlayerHasItem(Variable itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toScriptString() {
        return String.format("(player_has_item,%s),",itemId);
    }
}
