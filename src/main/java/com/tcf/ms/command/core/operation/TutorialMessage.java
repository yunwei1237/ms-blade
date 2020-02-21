package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TutorialMessage implements Operation {

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
