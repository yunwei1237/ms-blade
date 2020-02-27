package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (create_text_overlay, <destination>, <string_id>),  returns overlay id
 */
public class CreateTextOverlay implements Operation{

    private Variable destination;
    private Variable stringId;

    public CreateTextOverlay(Variable destination,Variable stringId) {
        this.destination = destination;
        this.stringId = stringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_text_overlay,%s,%s),",destination,stringId);
    }
}
