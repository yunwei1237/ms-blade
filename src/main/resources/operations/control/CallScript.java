package com.tcf.ms.command.core.operations.control;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CallScript implements Operation {

    private Variable scriptId;

    @Override
    public String toScriptString() {
        return String.format("(call_script,%s),",scriptId);
    }
}
