package com.tcf.ms.command.core.operations.control;

import com.tcf.ms.command.Operation;

@Deprecated
public class EndTry implements Operation {
    @Override
    public String toScriptString() {
        return "(end_try),";
    }
}
