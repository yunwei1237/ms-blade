package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetSpawnRadius implements Operation {

    private Variable value;

    public SetSpawnRadius(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_spawn_radius,%s),",value);
    }
}
