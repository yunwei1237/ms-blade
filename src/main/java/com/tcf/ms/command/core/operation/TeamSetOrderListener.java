package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TeamSetOrderListener implements Operation {

    private Variable teamNo;
    private Variable subClass;

    public TeamSetOrderListener(Variable teamNo,Variable subClass) {
        this.teamNo = teamNo;
        this.subClass = subClass;     
    }

    @Override
    public String toScriptString() {
        return String.format("(team_set_order_listener,%s,%s),",teamNo,subClass);
    }
}
