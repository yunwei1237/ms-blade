package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (create_check_box_overlay, <destination>),  returns overlay id
 */
public class CreateCheckBoxOverlay implements Operation{

    private Variable destination;

    public CreateCheckBoxOverlay(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_check_box_overlay,%s),",destination);
    }
}
