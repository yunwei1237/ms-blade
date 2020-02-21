package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class NumActiveTeamsLe implements Operation ,Conditable{

    private Variable value;

    public NumActiveTeamsLe(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(num_active_teams_le,%s),",value);
    }
}
