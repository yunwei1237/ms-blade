package com.tcf.ms.command.core.operations.condition;

import com.tcf.ms.command.Operation;

@Deprecated
public class InMetaMission implements Operation {
    @Override
    public String toScriptString() {
        return "(in_meta_mission),";
    }
}
