package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (team_get_movement_order, <destination>, <team_no>, <sub_class>),
 */
public class TeamGetMovementOrder implements Operation{

    private Variable destination;
    private Variable teamNo;
    private Variable subClass;

    public TeamGetMovementOrder(Variable destination,Variable teamNo,Variable subClass) {
        this.destination = destination;
        this.teamNo = teamNo;
        this.subClass = subClass;     
    }

    @Override
    public String toScriptString() {
        return String.format("(team_get_movement_order,%s,%s,%s),",destination,teamNo,subClass);
    }
}
