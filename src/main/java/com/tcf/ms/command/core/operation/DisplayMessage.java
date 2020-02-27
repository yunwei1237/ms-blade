package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (display_message,<string_id>,[hex_colour_code]),
 */
public class DisplayMessage implements Operation{

    private Variable stringId;
    private Variable hexColourCode;

    public DisplayMessage(Variable stringId,Variable hexColourCode) {
        this.stringId = stringId;
        this.hexColourCode = hexColourCode;     
    }

    @Override
    public String toScriptString() {
        return String.format("(display_message,%s,%s),",stringId,hexColourCode);
    }
}
