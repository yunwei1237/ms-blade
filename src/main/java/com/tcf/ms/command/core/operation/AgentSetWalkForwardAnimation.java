package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class AgentSetWalkForwardAnimation implements Operation {

    

    public AgentSetWalkForwardAnimation() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_walk_forward_animation),");
    }
}
