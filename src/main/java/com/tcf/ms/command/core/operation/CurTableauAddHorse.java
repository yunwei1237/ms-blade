package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CurTableauAddHorse implements Operation {

    private Variable itemId;
    private Variable positionNo;
    private Variable animationId;

    public CurTableauAddHorse(Variable itemId,Variable positionNo,Variable animationId) {
        this.itemId = itemId;
        this.positionNo = positionNo;
        this.animationId = animationId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_add_horse,%s,%s,%s),",itemId,positionNo,animationId);
    }
}
