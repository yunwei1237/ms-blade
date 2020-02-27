package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *  (store_normalized_team_count,<destination>, <team_no>),  Counts the number of agents belonging to a team  and normalizes the result regarding battle_size and advantage.
 */
public class StoreNormalizedTeamCount implements Operation{

    private Variable destination;
    private Variable teamNo;

    public StoreNormalizedTeamCount(Variable destination,Variable teamNo) {
        this.destination = destination;
        this.teamNo = teamNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_normalized_team_count,%s,%s),",destination,teamNo);
    }
}
