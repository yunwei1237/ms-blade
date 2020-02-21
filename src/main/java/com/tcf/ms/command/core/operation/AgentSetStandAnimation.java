package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class AgentSetStandAnimation implements Operation {

    

    public AgentSetStandAnimation() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_stand_animation),");
    }
}
