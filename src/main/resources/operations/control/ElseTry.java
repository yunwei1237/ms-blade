package com.tcf.ms.command.core.operations.control;

import com.tcf.ms.command.Operation;

public class ElseTry implements Operation {
    @Override
    public String toScriptString() {
        return "(else_try),";
    }
}
