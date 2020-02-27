package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (display_log_message,<string_id>,[hex_colour_code]),
 */
public class DisplayLogMessage implements Operation{

    private Variable stringId;
    private Variable hexColourCode;

    public DisplayLogMessage(Variable stringId,Variable hexColourCode) {
        this.stringId = stringId;
        this.hexColourCode = hexColourCode;     
    }

    @Override
    public String toScriptString() {
        return String.format("(display_log_message,%s,%s),",stringId,hexColourCode);
    }
}
