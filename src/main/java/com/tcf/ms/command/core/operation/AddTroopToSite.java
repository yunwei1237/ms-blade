package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddTroopToSite implements Operation {

    private Variable troopId;
    private Variable sceneId;
    private Variable entryNo;

    public AddTroopToSite(Variable troopId,Variable sceneId,Variable entryNo) {
        this.troopId = troopId;
        this.sceneId = sceneId;
        this.entryNo = entryNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_troop_to_site,%s,%s,%s),",troopId,sceneId,entryNo);
    }
}
