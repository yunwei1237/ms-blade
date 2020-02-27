package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (tutorial_message,<string_id>, <color>),  set string_id = -1 for hiding the message
 */
public class TutorialMessage implements Operation{

    private Variable stringId;
    private Variable color;

    public TutorialMessage(Variable stringId,Variable color) {
        this.stringId = stringId;
        this.color = color;     
    }

    @Override
    public String toScriptString() {
        return String.format("(tutorial_message,%s,%s),",stringId,color);
    }
}
