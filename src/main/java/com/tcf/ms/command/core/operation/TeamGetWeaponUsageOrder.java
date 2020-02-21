package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TeamGetWeaponUsageOrder implements Operation {

    private Variable destination;
    private Variable teamNo;
    private Variable subClass;

    public TeamGetWeaponUsageOrder(Variable destination,Variable teamNo,Variable subClass) {
        this.destination = destination;
        this.teamNo = teamNo;
        this.subClass = subClass;     
    }

    @Override
    public String toScriptString() {
        return String.format("(team_get_weapon_usage_order,%s,%s,%s),",destination,teamNo,subClass);
    }
}
