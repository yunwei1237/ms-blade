package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PropInstanceSetPosition implements Operation {

    

    public PropInstanceSetPosition() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(prop_instance_set_position),");
    }
}
