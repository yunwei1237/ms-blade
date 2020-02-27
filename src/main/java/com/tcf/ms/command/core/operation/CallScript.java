package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (call_script,<script_id>),
 */
public class CallScript implements Operation{

    private Variable scriptId;

    public CallScript(Variable scriptId) {
        this.scriptId = scriptId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(call_script,%s),",scriptId);
    }
}
