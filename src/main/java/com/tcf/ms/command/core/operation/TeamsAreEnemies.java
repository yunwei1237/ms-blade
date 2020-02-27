package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (teams_are_enemies, <team_no>, <team_no_2>), 
 */
public class TeamsAreEnemies implements Conditable{

    private Variable teamNo;
    private Variable teamNo2;

    public TeamsAreEnemies(Variable teamNo,Variable teamNo2) {
        this.teamNo = teamNo;
        this.teamNo2 = teamNo2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(teams_are_enemies,%s,%s),",teamNo,teamNo2);
    }
}
