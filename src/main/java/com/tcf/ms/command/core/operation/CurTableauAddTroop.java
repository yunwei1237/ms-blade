package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CurTableauAddTroop implements Operation {

    private Variable troopId;
    private Variable positionNo;
    private Variable animationId;
    private Variable instanceNo;

    public CurTableauAddTroop(Variable troopId,Variable positionNo,Variable animationId,Variable instanceNo) {
        this.troopId = troopId;
        this.positionNo = positionNo;
        this.animationId = animationId;
        this.instanceNo = instanceNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_add_troop,%s,%s,%s,%s),",troopId,positionNo,animationId,instanceNo);
    }
}
