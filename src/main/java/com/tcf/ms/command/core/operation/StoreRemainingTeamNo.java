package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_remaining_team_no,<destination>),
 */
public class StoreRemainingTeamNo implements Operation{

    private Variable destination;

    public StoreRemainingTeamNo(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_remaining_team_no,%s),",destination);
    }
}
