package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CreateButtonOverlay implements Operation {

    private Variable destination;
    private Variable stringId;

    public CreateButtonOverlay(Variable destination,Variable stringId) {
        this.destination = destination;
        this.stringId = stringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_button_overlay,%s,%s),",destination,stringId);
    }
}
