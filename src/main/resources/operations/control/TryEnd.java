package com.tcf.ms.command.core.operations.control;

import com.tcf.ms.command.Operation;

public class TryEnd implements Operation {
    @Override
    public String toScriptString() {
        return "(try_end),";
    }
}
