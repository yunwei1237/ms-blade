package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TeamGiveOrder implements Operation {

    private Variable teamNo;
    private Variable subClass;
    private Variable orderId;

    public TeamGiveOrder(Variable teamNo,Variable subClass,Variable orderId) {
        this.teamNo = teamNo;
        this.subClass = subClass;
        this.orderId = orderId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(team_give_order,%s,%s,%s),",teamNo,subClass,orderId);
    }
}
