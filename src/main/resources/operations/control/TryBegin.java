package com.tcf.ms.command.core.operations.control;

import com.tcf.ms.command.Operation;

public class TryBegin implements Operation {
    @Override
    public String toScriptString() {
        return "(try_begin),";
    }
}
