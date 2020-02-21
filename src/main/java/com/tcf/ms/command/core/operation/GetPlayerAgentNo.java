package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class GetPlayerAgentNo implements Operation {

    private Variable destination;

    public GetPlayerAgentNo(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_player_agent_no,%s),",destination);
    }
}
