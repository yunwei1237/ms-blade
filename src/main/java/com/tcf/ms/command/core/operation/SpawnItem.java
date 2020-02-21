package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class SpawnItem implements Operation {

    

    public SpawnItem() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(spawn_item),");
    }
}
