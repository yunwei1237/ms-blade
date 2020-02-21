package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class SetSpawnPosition implements Operation {

    

    public SetSpawnPosition() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(set_spawn_position),");
    }
}
