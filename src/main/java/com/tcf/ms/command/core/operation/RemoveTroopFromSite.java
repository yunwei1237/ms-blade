package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class RemoveTroopFromSite implements Operation {

    private Variable troopId;
    private Variable sceneId;

    public RemoveTroopFromSite(Variable troopId,Variable sceneId) {
        this.troopId = troopId;
        this.sceneId = sceneId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(remove_troop_from_site,%s,%s),",troopId,sceneId);
    }
}
