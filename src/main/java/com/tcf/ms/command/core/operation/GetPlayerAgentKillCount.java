package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class GetPlayerAgentKillCount implements Operation {

    private Variable destination;
    private Variable getWounded;

    public GetPlayerAgentKillCount(Variable destination,Variable getWounded) {
        this.destination = destination;
        this.getWounded = getWounded;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_player_agent_kill_count,%s,%s),",destination,getWounded);
    }
}