package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (question_box,<string_id>, [<yes_string_id>], [<no_string_id>]),
 */
public class QuestionBox implements Operation{

    private Variable stringId;
    private Variable yesStringId;
    private Variable noStringId;

    public QuestionBox(Variable stringId,Variable yesStringId,Variable noStringId) {
        this.stringId = stringId;
        this.yesStringId = yesStringId;
        this.noStringId = noStringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(question_box,%s,%s,%s),",stringId,yesStringId,noStringId);
    }
}
