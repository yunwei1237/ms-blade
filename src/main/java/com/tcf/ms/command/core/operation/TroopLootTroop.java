package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopLootTroop implements Operation {

    private Variable targetTroop;
    private Variable sourceTroopId;
    private Variable probability;

    public TroopLootTroop(Variable targetTroop,Variable sourceTroopId,Variable probability) {
        this.targetTroop = targetTroop;
        this.sourceTroopId = sourceTroopId;
        this.probability = probability;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_loot_troop,%s,%s,%s),",targetTroop,sourceTroopId,probability);
    }
}
