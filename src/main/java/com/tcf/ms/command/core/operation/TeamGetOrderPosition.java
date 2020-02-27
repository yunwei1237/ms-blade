package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (team_get_order_position, <position_no>, <team_no>, <sub_class>),
 */
public class TeamGetOrderPosition implements Operation{

    private Variable positionNo;
    private Variable teamNo;
    private Variable subClass;

    public TeamGetOrderPosition(Variable positionNo,Variable teamNo,Variable subClass) {
        this.positionNo = positionNo;
        this.teamNo = teamNo;
        this.subClass = subClass;     
    }

    @Override
    public String toScriptString() {
        return String.format("(team_get_order_position,%s,%s,%s),",positionNo,teamNo,subClass);
    }
}
