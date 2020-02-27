package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (get_global_haze_amount, <destination>),  returns a value between 0-100
 */
public class GetGlobalHazeAmount implements Operation{

    private Variable destination;

    public GetGlobalHazeAmount(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_global_haze_amount,%s),",destination);
    }
}
