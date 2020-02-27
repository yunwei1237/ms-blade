package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (create_text_box_overlay, <destination>),  returns overlay id
 */
public class CreateTextBoxOverlay implements Operation{

    private Variable destination;

    public CreateTextBoxOverlay(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_text_box_overlay,%s),",destination);
    }
}
