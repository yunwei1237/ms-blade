package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetMissionResult implements Operation {

    private Variable value;

    public SetMissionResult(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_mission_result,%s),",value);
    }
}
