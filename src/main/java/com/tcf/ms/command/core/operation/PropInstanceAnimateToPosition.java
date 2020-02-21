package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PropInstanceAnimateToPosition implements Operation {

    

    public PropInstanceAnimateToPosition() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(prop_instance_animate_to_position),");
    }
}
