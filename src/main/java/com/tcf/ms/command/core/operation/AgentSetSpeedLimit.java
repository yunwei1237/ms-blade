package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class AgentSetSpeedLimit implements Operation {

    

    public AgentSetSpeedLimit() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_speed_limit),");
    }
}
