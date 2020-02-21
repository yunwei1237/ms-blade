package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class SpawnHorse implements Operation {

    

    public SpawnHorse() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(spawn_horse),");
    }
}
