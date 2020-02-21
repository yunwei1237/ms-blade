package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddPointLight implements Operation {

    private Variable flickerMagnitude;
    private Variable flickerInterval;

    public AddPointLight(Variable flickerMagnitude,Variable flickerInterval) {
        this.flickerMagnitude = flickerMagnitude;
        this.flickerInterval = flickerInterval;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_point_light,%s,%s),",flickerMagnitude,flickerInterval);
    }
}
