package com.tcf.ms.command.core.operations.control;

import com.tcf.ms.command.Operation;

@Deprecated
public class ElseTryBegin implements Operation {
    @Override
    public String toScriptString() {
        return "(else_try_begin),";
    }
}
