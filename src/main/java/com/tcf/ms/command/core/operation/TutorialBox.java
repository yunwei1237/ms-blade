package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

@Deprecated
public class TutorialBox implements Operation {

    private Variable textStringId;
    private Variable titleStringId;

    public TutorialBox(Variable textStringId,Variable titleStringId) {
        this.textStringId = textStringId;
        this.titleStringId = titleStringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(tutorial_box,%s,%s),",textStringId,titleStringId);
    }
}
