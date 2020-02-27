package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (tutorial_box,<string_id>,<string_id>),  deprecated use dialog_box instead.
 */
@Deprecated
public class TutorialBox implements Operation{

    private Variable stringId;
    private Variable stringId2;

    public TutorialBox(Variable stringId,Variable stringId2) {
        this.stringId = stringId;
        this.stringId2 = stringId2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(tutorial_box,%s,%s),",stringId,stringId2);
    }
}
