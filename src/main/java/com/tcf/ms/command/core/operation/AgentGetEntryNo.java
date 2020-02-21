package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentGetEntryNo implements Operation {

    private Variable destination;
    private Variable agentId;

    public AgentGetEntryNo(Variable destination,Variable agentId) {
        this.destination = destination;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_entry_no,%s,%s),",destination,agentId);
    }
}
