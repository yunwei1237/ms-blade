package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_spawn_position, <position_no>) 
 */
public class SetSpawnPosition implements Operation{

    private Variable positionNo;

    public SetSpawnPosition(Variable positionNo) {
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_spawn_position,%s),",positionNo);
    }
}
