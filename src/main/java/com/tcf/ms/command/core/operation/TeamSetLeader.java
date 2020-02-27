package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (team_set_leader, <team_no>, <new_leader_agent_id>),
 */
public class TeamSetLeader implements Operation{

    private Variable teamNo;
    private Variable newLeaderAgentId;

    public TeamSetLeader(Variable teamNo,Variable newLeaderAgentId) {
        this.teamNo = teamNo;
        this.newLeaderAgentId = newLeaderAgentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(team_set_leader,%s,%s),",teamNo,newLeaderAgentId);
    }
}
