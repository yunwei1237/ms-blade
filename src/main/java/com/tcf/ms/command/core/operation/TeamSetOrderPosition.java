package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (team_set_order_position, <team_no>, <sub_class>, <position_no>),
 */
public class TeamSetOrderPosition implements Operation{

    private Variable teamNo;
    private Variable subClass;
    private Variable positionNo;

    public TeamSetOrderPosition(Variable teamNo,Variable subClass,Variable positionNo) {
        this.teamNo = teamNo;
        this.subClass = subClass;
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(team_set_order_position,%s,%s,%s),",teamNo,subClass,positionNo);
    }
}
