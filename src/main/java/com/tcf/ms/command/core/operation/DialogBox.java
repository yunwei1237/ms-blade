package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (tutorial_box,<text_string_id>,<title_string_id>),
 */
public class DialogBox implements Operation{

    private Variable textStringId;
    private Variable titleStringId;

    public DialogBox(Variable textStringId,Variable titleStringId) {
        this.textStringId = textStringId;
        this.titleStringId = titleStringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(dialog_box,%s,%s),",textStringId,titleStringId);
    }
}
