package com.tcf.ms.command.core.operations.condition;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class MapFree implements Operation, Conditable {

    @Override
    public String toScriptString() {
        return "(map_free),";
    }
}
