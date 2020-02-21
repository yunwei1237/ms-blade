package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TeamSetRelation implements Operation {

    private Variable teamNo;
    private Variable teamNo2;
    private Variable value;

    public TeamSetRelation(Variable teamNo,Variable teamNo2,Variable value) {
        this.teamNo = teamNo;
        this.teamNo2 = teamNo2;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(team_set_relation,%s,%s,%s),",teamNo,teamNo2,value);
    }
}
