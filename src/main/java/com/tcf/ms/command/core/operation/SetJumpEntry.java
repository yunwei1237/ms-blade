package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_jump_entry,<entry_no>),
 */
public class SetJumpEntry implements Operation{

    private Variable entryNo;

    public SetJumpEntry(Variable entryNo) {
        this.entryNo = entryNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_jump_entry,%s),",entryNo);
    }
}
