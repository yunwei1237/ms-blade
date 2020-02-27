package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_tableau_add_troop, <troop_id>, <position_no>, <animation_id>, <instance_no>),  if instance_no value is 0 or less, then the face is not generated randomly (important for heroes)
 */
public class CurTableauAddTroop implements Operation{

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
