package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetVisitors implements Operation {

    private Variable entryNo;
    private Variable troopId;
    private Variable numberOfTroops;

    public SetVisitors(Variable entryNo,Variable troopId,Variable numberOfTroops) {
        this.entryNo = entryNo;
        this.troopId = troopId;
        this.numberOfTroops = numberOfTroops;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_visitors,%s,%s,%s),",entryNo,troopId,numberOfTroops);
    }
}
