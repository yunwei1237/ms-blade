package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (team_get_leader, <destination>, <team_no>),
 */
public class TeamGetLeader implements Operation{

    private Variable destination;
    private Variable teamNo;

    public TeamGetLeader(Variable destination,Variable teamNo) {
        this.destination = destination;
        this.teamNo = teamNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(team_get_leader,%s,%s),",destination,teamNo);
    }
}
